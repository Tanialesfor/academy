package by.academy.homework1;

import java.util.Scanner;
import java.io.IOException;

public class Task2 {
	public static void main (String[] args) throws IOException{
		Scanner sc= new Scanner(System.in);
		 		
		System.out.println("Введите тип переменной: ");
		if (sc.hasNext()) {
			String type=sc.next();
			type=type.toLowerCase();
		
			System.out.println("Введите значение переменной: ");
			
						
			switch (type) {
				case "int":{
					if (sc.hasNextInt()) {
						int a=sc.nextInt();
						System.out.println("Остаток от деления на 2: "+ a%2);						
					} 
					else {						
						System.out.println("Введенная переменная должна быть типа int");					
					} 
					break;
				}	
				case "double":{
					if (sc.hasNextDouble()) {
						double b =sc.nextDouble();
						System.out.println("70% от числа: "+b*70/100);
					}
					else {						
						System.out.println("Введенная переменная должна быть типа double");					
					} 
					break;
				}
				case "float":{
					if (sc.hasNextFloat()) {	
						float c=sc.nextFloat();
						System.out.println("Квадрат числа: "+c*c);
					}
					else {						
						System.out.println("Введенная переменная должна быть типа float");					
					} 
					break;
				}
				case "char": {
					int d = System.in.read();
//					char ch= (char) d;  получение символа по коду
					System.out.println(d);
					break;
				}
				
				case "string": {
					if (sc.hasNext()) {
						String f=sc.next();
						System.out.println("Hello "+f);
					}
					else {						
						System.out.println("Введенная переменная должна быть типа string");					
					}
					break;
				}	
				default:{
					System.out.println("Unsupported type");
				}	
			}
				
		}
		else {
				System.out.println("Тип переменной может быть строковым");
				}
			sc.close();
	}
}
