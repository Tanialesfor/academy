package by.academy.homework2;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Введите первую строку: ");
		StringBuilder str1= new StringBuilder(sc.next());
		System.out.println("Введите вторую строку: ");
		StringBuilder str2= new StringBuilder(sc.next());
		String str=str1.toString();
		
		for (int i=0; i<str.length();i++) {					
			if (str1.toString().indexOf(str.charAt(i))>-1)
				str1.deleteCharAt(str1.toString().indexOf(str.charAt(i)));
			if (str2.toString().indexOf(str.charAt(i))>-1)
				str2.deleteCharAt(str2.toString().indexOf(str.charAt(i)));
			
//			System.out.println(str1);
//			System.out.println(str2);
		}
			if (str1.toString().isEmpty() && str2.toString().isEmpty())		
				System.out.println("true");
			else System.out.println("false");
		sc.close();
	}
}
