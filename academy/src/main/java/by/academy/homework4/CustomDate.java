package by.academy.homework4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.time.DayOfWeek;
import java.util.Scanner;


import by.academy.deal.Validator;
//Задание 1.
//Создать класс CustomDate, используя вложенные классы Год, Месяц, День. 
//Методы: задать дату, вывести на консоль день недели по заданной дате. 
//День недели представить в виде перечисления. 
//Рассчитать количество дней, в заданном временном промежутке.
//Один из конструкторов - строка в формате dd-mm-yyyy, добавить валидацию для этой строки. 
//После валидации в конструкторе создаем объекты класса Year, Month, Day.
//Добавить метод, который проверяет высокосный ли год или нет.


public class CustomDate implements  Validator{

	public Year year;
	public Month month;
	public Day day;
	static DaysofWeek dayOfWeek;			
	
	public String toString() {
		return this.year.x+"/"+this.month.x+"/"+this.day.x;
	}
	
//	private int daysNumber;

	
	
//	public enum DaysofWeek {
//		MONDAY ("Понедельник", 1), TUESDAY("Вторник",2), WEDNESDAY("Среда",3), THURSDAY("Четверг",4), FRIDAY("Пятница",5), SATURDAY("Суббота",6), SUNDAY("Воскресенье",7);
//		String name;
//		int daysNumber;
//		
//		 DaysofWeek (String name, int daysNumber){
//			this.name=name;
//			this.daysNumber=daysNumber;
//		}
//		 
//		 
//	}
	
	
	
	 
//	public CustomDate(int daysNumber) {
//		this.daysNumber=daysNumber;
//	}
	
//	public static CustomDate MONDAY=new CustomDate(1);
//	public static CustomDate TUESDAY=new CustomDate(2);
//	public static CustomDate WEDNESDAY=new CustomDate(3);
//	public static CustomDate THURSDAY=new CustomDate(4);
//	public static CustomDate FRIDAY =new CustomDate(5);
//	public static CustomDate SATURDAY =new CustomDate(6);
//	public static CustomDate SUNDAY =new CustomDate(7);
	
	
	
	
//	
//	public LocalDate getData() {
//		return data;
//	}
//
//	public void setData(LocalDate data) {
//		this.data = data;
//	}

	public CustomDate() {
		super();
	}
//	public setDate(int year, int month, int day ) {
//		LocalDate data=LocalDate.of(year, month, day);
//		DayOfWeek dayWeekEnum = data.getDayOfWeek();
//			
//	}
	
	public LocalDate toLocalDate() {
		return LocalDate.of(this.year.x,this.month.x,this.day.x);
	} 
	
	public void printDayOfWeek() {					
		System.out.println("День недели(номер): "+this.toLocalDate().getDayOfWeek().getValue());
	}
	
	@Override
	public boolean isValid(String string) {
		// TODO Auto-generated method stub
		return false;
	}

	public class Year{
		int x;
		public Year(int year) {
			this.x=year;
		}
		
		public boolean isleapYear() {
			if (x%4==0) {
				return true;
			} else return false;
		}
	}
	public class Month{
		int x;
		String name;
		int daysMonth;
		Year year; 
		
		public Month(int month) {
			this.x=month;
		}
		
		public int getDays(int monthNumber, Year monthYear) {
            switch (monthNumber) {
 
                case 1:
                	daysMonth = 31;
                    break;
                case 2:
                	if (monthYear.isleapYear()==true)
                		daysMonth = 29;
                	else 
                		daysMonth = 28;
                    break;
                case 3:
                	daysMonth = 31;
                    break;
                case 4:
                	daysMonth = 30;
                    break;
                case 5:
                	daysMonth = 31;
                    break;
                case 6:
                	daysMonth = 30;
                    break;
                case 7:
                	daysMonth = 31;
                    break;
                case 8:
                	daysMonth = 31;
                    break;
                case 9:
                	daysMonth = 30;
                    break;
                case 10:
                	daysMonth = 31;
                    break;
                case 11:
                	daysMonth = 30;
                    break;
                case 12:
                	daysMonth = 31;
                    break;
                default:
                    System.out.println("Номер месяца введен не верно.");
                    break;
            }
            return daysMonth;
        }		
	}
	public class Day{
		int x;
		String name;
		int dayOfWeek; 
		public Day(int day) {
			this.x=day;
		}
	}		
	
	public enum DaysofWeek {
		MONDAY ("Понедельник", 1), TUESDAY("Вторник",2), WEDNESDAY("Среда",3), THURSDAY("Четверг",4), FRIDAY("Пятница",5), SATURDAY("Суббота",6), SUNDAY("Воскресенье",7);
		String name;
		int daysNumber;
					
		DaysofWeek (String name, int daysNumber){
			this.name=name;
			this.daysNumber=daysNumber;			
		}				 
	}	
	
	public void setDayOfWeek() {
		switch (this.toLocalDate().getDayOfWeek().toString()) {
		case "MONDAY" :
			dayOfWeek=DaysofWeek.MONDAY;
			break;			
		case "TUESDAY" :
			dayOfWeek=DaysofWeek.TUESDAY;
			break;				
		case "WEDNESDAY" :
			dayOfWeek=DaysofWeek.WEDNESDAY;
			break;			
		case "THURSDAY" :
			dayOfWeek=DaysofWeek.THURSDAY;
			break;			
		case "FRIDAY" :
			dayOfWeek=DaysofWeek.FRIDAY;
			break;			
		case "SATURDAY" :
			dayOfWeek=DaysofWeek.SATURDAY;
			break;			
		case "SUNDAY" :
			dayOfWeek=DaysofWeek.SUNDAY;
			break;			
		}	
	}
	
	public void printCustomDayOfWeek() {
		System.out.println("День недели: "+this.dayOfWeek.name);		
	}
	
	public CustomDate(int year, int month, int day ) {
		this.year = this.new Year(year);	
		this.month = this.new Month(month);
		this.day = this.new Day(day);
		this.setDayOfWeek();
	}	
	
	public CustomDate(String str) {
		super();		
	}

//	DateTimeFormatter formatterDTa=DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.US);
//	LocalDate lda=LocalDate.parse(data, formatterDTa);	
//	System.out.println("День: "+lda.getDayOfMonth());
//	

}
