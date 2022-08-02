package by.academy.homework4;

import java.time.LocalDate;
import java.util.Locale;
import java.time.DayOfWeek;
import java.util.Scanner;

public class CustomDateMain {
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите год:");
//			if (sc.hasNextInt()) {
			int year = sc.nextInt();
//			} else {
//				System.out.println("Год может быть только целым числом");
//			}
//				
		System.out.println("Введите месяц:");
//			if (sc.hasNextInt()) {
				int month = sc.nextInt();
//				if (sc.nextInt()<1 || sc.nextInt()>12) {
//					System.out.println("Месяц может быть только целым числом от 1 до 12 включительно");
//			}
//			} else {
//				System.out.println("Месяц может быть только целым числом");
//			}
//		
//		
		System.out.println("Введите день месяца:");
//			if (sc.hasNextInt()) {
			int day = sc.nextInt();
//				if (sc.nextInt()<1 || sc.nextInt()>31 ) {
//					System.out.println("День может быть только целым числом от 1 до 31 включительно");
//				}
//			}
//			else {
//				System.out.println("День может быть только целым числом");
//			}
		
		CustomDate date1=new CustomDate(year,month,day);
		LocalDate data2=LocalDate.now();
		System.out.println(date1.toString());
		System.out.println(date1.month.getDays(date1.month.x, date1.year));
		date1.printDayOfWeek();
		date1.printCustomDayOfWeek();
		
			System.out.println("Введите дату:");
			String strData=sc.next();
			CustomDate data3=new CustomDate(strData);
			data3.isCustomDateValid(strData);
			
			
			sc.close();	
	}
	
}
