package by.academy.lesson3;

import java.util.Scanner;

public class Task0 {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string: ");
		String month=sc.next();
				
			/*	if (sc.hasNextInt()) {
			int str=sc.nextInt();
		System.out.println("Your string is: +str");}
		
		String str=sc.next();
	*/	
		month=month.toLowerCase();
		switch (month) {
		case "январь":
			System.out.println("1 месяц");
			break;
		case "февраль":
			System.out.println("2 месяц");
			break;
		case "март":
			System.out.println("3 месяц");
		case "апрель":
			System.out.println("4 месяц");
			break;
		case "май":
			System.out.println("5 месяц");
		case "июнь":
			System.out.println("6 месяц");
			
			default:
			System.out.println("Это не месяц");
		}
						
		sc.close();	
	}
}
