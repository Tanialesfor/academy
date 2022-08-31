package by.academy.finalwork.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import by.academy.finalwork.domen.*;
import by.academy.finalwork.service.*;

//Авиакомпания. Определить иерархию самолетов. Создать авиакомпанию.
//Посчитать общую вместимость и грузоподъемность. Провести сортировку самолетов
//компании по дальности полета. Найти самолет в компании, соответствующий заданному
//диапазону параметров потребления горючего. 

public class AirlineMain {
	public static void main(String[] args) throws IOException {
		
		ArrayList <Plain> plains = new ArrayList<Plain> ();
		Airline airline = null;
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
//			Plain[] plainsarray = new Plain[plains.size()];
			airline = new Airline(plains);
			//airline = new Airline(plains.toArray(new Plain[0]));
		}	
		
		System.out.println(airline.toString());
		System.out.println(airline.getCapacityAll());
		System.out.println(airline.getcarryingAll());
		airline.sortPlain();

	}
}