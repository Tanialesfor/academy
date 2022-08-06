package by.academy.homework4;

import java.time.LocalDate;
import java.util.Scanner;

public class CustomDateMain {
	public static void main(String[] args) {
		
		boolean skip = false;	
		int year = 0;
		int month = 0;
		int day = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите год:");
		while (sc.hasNext()) {
		      if (sc.hasNextInt()) {
		        year = sc.nextInt();
		        break;
		      } else {
			    	System.out.println("Введен некорректный год. Повторите ввод");  
			        sc.next();
			      }
			    }
			    
		System.out.println("Введите месяц:");
		while (sc.hasNext()) {
		      if (sc.hasNextInt()) {
		        month = sc.nextInt();
		        if (month<1 || month>12) {
 				  System.out.println("Месяц может быть только целым числом от 1 до 12 включительно. Повторите ввод");
		        } else {
			          break;
		        }
		      } else {
		    	System.out.println("Введен некорректный месяц. Повторите ввод");  
		        sc.next();
		      }
		    }
		             
		System.out.println("Введите день месяца:");		
		    while (sc.hasNext()) {
		      if (sc.hasNextInt()) {
		        day = sc.nextInt();
		        if (day < 1 || day > 31) {
		          System.out.println("День может быть только целым числом от 1 до 31 включительно. Повторите ввод");
		        } else {
		          break;
		        }
		      } else {
		    	System.out.println("Введен некорректный день месяца. Повторите ввод");  
		        sc.next();
		      }
		    }
		   	   		
		CustomDate date1=new CustomDate(year,month,day);
		
//		System.out.println("Полученная дата согласно вводимым значениям: "+date1.toString());
//		System.out.println(date1.month.getDays(date1.month.value, date1.year));
		date1.printDayOfWeek();
		date1.printCustomDayOfWeek();
		
		LocalDate date2=LocalDate.now();
		LocalDate endDate = date1.toLocalDate();
		LocalDate startDate = LocalDate.of(date2.getYear(),date2.getMonth(),date2.getDayOfMonth());
		int period=(int)Math.abs((endDate.toEpochDay())-startDate.toEpochDay());
		System.out.println("Количество дней в промежутке между date1 и date2: "+period);
		
		
			System.out.println("Введите дату:");
			
			do{
				skip=false;	
				CustomDate data=new CustomDate();
				String strData=sc.next();
			
			if(data.isValid(strData)==false) {
				System.out.println("Дата введена не верно. Повторите ввод");
				skip=true;
				continue;
			}
			else{				
			    CustomDate data3=new CustomDate(strData);
				System.out.println("Год: "+data3.getYear().value);
				System.out.println("Месяц: "+data3.getMonth().value);
				System.out.println("День месяца: "+data3.getDay().value);	
			}
			
			}
			while (skip=true);
			sc.close();	
	}
}
