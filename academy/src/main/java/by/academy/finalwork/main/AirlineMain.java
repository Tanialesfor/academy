package by.academy.finalwork.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import by.academy.finalwork.domen.*;
import by.academy.finalwork.service.*;

//Авиакомпания. Определить иерархию самолетов. Создать авиакомпанию.
//Посчитать общую вместимость и грузоподъемность. Провести сортировку самолетов
//компании по дальности полета. Найти самолет в компании, соответствующий заданному
//диапазону параметров потребления горючего. 

public class AirlineMain {
	public static void main(String[] args) throws IOException {
		
		double from=0;
		double to=0;
		Airline airline = null;
		ArrayList <Plain> plains = new ArrayList<Plain> ();
		
		try ( BufferedReader br = new BufferedReader(new FileReader("src/finalwork/file.txt"))) {
			String str;
			while ((str=br.readLine()) != null) {
				String[] arrayStr =str.split(",");
				for (int i=0;i<arrayStr.length;i++) {
					arrayStr[i]=arrayStr[i].trim();
				}
				switch (arrayStr[1]) {
					case "passenger": {
						PassengerPlain plain = new PassengerPlain(arrayStr[0],arrayStr[1], Double.parseDouble(arrayStr[2]),Integer.parseInt(arrayStr[3]),Double.parseDouble(arrayStr[4]),Double.parseDouble(arrayStr[5]),Double.parseDouble(arrayStr[6]),Double.parseDouble(arrayStr[7]));
						plains.add(plain);
						break;
					}
					case "cargo": {
						CargoPlain plain = new CargoPlain(arrayStr[0],arrayStr[1], Double.parseDouble(arrayStr[2]),Integer.parseInt(arrayStr[3]),Double.parseDouble(arrayStr[4]),Double.parseDouble(arrayStr[5]),Double.parseDouble(arrayStr[6]),Double.parseDouble(arrayStr[7]));
						plains.add(plain);
						break;
					}
					case "smallEngine": {
						SmallEnginePlain plain = new SmallEnginePlain(arrayStr[0],arrayStr[1], Double.parseDouble(arrayStr[2]),Integer.parseInt(arrayStr[3]),Double.parseDouble(arrayStr[4]),Double.parseDouble(arrayStr[5]),Double.parseDouble(arrayStr[6]),Double.parseDouble(arrayStr[7]));
						plains.add(plain);
						break;
					}					
				}
		    }
		    	   			
		}	catch (IOException e) {
			System.out.println(e.getMessage());
		}	
		
		if (plains.isEmpty()==false) { 
			airline = new Airline(plains);
		}	
		
		System.out.println("Моя авиакомпания: "+"\n"+airline.toString());
		
		System.out.println("Общая вместимость авиакомпании: "+airline.getCapacityAll());
		
		System.out.println("Общая грузоподъемность авиакомпании: "+airline.getCarryingAll());
		
		airline.sortPlain();
		
		System.out.println("Введите нижнюю границу диапазона чисел типа double больше или равно 0 для параметра потребления горючего:");
		Scanner sc= new Scanner(System.in);
		while (sc.hasNext()) {
			if (sc.hasNextDouble()) {
				from=sc.nextDouble();
				if  (from<0) {
					System.out.println("Число может быть только положительным.");	
				} else {
					break;
				}
			 } else {
				System.out.println("Введено неккоректное число. Повторите ввод");  
			    sc.next();
			 }
		 }  
		
		System.out.println("Введите верхнюю границу диапазона чисел типа double больше или равно "+ from+" для параметра потребления горючего:");		
		while (sc.hasNext()) {
			if (sc.hasNextDouble()) {
				to=sc.nextDouble();
				if  (to<from) {
					System.out.println("Число верхней границы не может быть меньше числа нижней границы.");	
					System.out.println("Введено неккоректное число. Повторите ввод");  
				} else 	{
					break;
				}
			 } else {
				System.out.println("Введено неккоректное число. Повторите ввод");  
			    sc.next();
			 }
		 }  
		
		System.out.println("Самолеты, которые соответствуют заданному диапазону по расходу горючего:"+"\n"+airline.findAllPlain(from, to));
		
		sc.close();	
	}	
}
	