package by.academy.homework1;

import java.util.Scanner;

public class Task2 {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		 		
		System.out.println("Введите тип переменной: ");
		if (sc.hasNext()) {
			String type=sc.next();
			type=type.toLowerCase();
		
			System.out.println("Введите значение переменной: ");
			if (sc.hasNextInt()) {
				int x=sc.nextInt();
						
			switch (type) {
				case "int":
				System.out.println("Остаток от деления на 2: "+x%2);
					break;
				case "double":
				System.out.println("70% от числа: "+x*70/100);
					break;
				case "float":
				
				System.out.println("Квадрат числа: "+x*x);
					break;
				case "char":
//	System.out.println(": "+);
					break;
				case "String":
				System.out.println("Hello "+x);
				default:
				System.out.println("Unsupported type");
			}
	
			else {
				System.out.println("Значение переменной должно быть целочисленным");
			}
		}
	
		
		else {
				System.out.println("Тип переменной может быть строковым");
				}
		}
		sc.close();
	}
}
