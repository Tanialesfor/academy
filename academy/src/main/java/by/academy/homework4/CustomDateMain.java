package by.academy.homework4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.time.DayOfWeek;
import java.util.Scanner;

public class CustomDateMain {
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите год");
		
		int year = sc.nextInt();
				
		System.out.println("Введите месяц");
		
		int month = sc.nextInt();
		
		System.out.println("Введите день месяца");
		
		int day = sc.nextInt();
		
		CustomDate date1=new CustomDate(year,month,day);
		LocalDate data2=LocalDate.now();
		System.out.println(date1.toString());
		System.out.println(date1.month.getDays(date1.month.x, date1.year));
		date1.printDayOfWeek();
		date1.printCustomDayOfWeek();
	}
}
