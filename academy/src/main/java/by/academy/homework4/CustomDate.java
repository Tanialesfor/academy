package by.academy.homework4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.time.DayOfWeek;

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
	
//	private int daysNumber;

	
	public enum DaysofWeek {
		MONDAY ("Понедельник", 1), TUESDAY("Вторник",2), WEDNESDAY("Среда",3), THURSDAY("Четверг",4), FRIDAY("Пятница",5), SATURDAY("Суббота",6), SUNDAY("Воскресенье",7);
		String name;
		int daysNumber;
		
		 DaysofWeek (String name, int daysNumber){
			this.name=name;
			this.daysNumber=daysNumber;
		}
	}
	
	 
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
	public void print(LocalDate data) {
			
		
		System.out.println("День недели: "+data.getDayOfWeek());
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
	}
	public class Month{
		int x;
		String name;
		public Month(int month) {
			this.x=month;
		}
	}
	public class Day{
		int x;
		String name;
		String dateOfWeek; 
		public Day(int day) {
			this.x=day;
		}
	}
	
	public CustomDate(int year, int month, int day ) {
		this.year = this.new Year(year);	
		this.month = this.new Month(month);
		this.day = this.new Day(day);
	}	
	
	public CustomDate(String str) {
		super();		
	}

//	DateTimeFormatter formatterDTa=DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.US);
//	LocalDate lda=LocalDate.parse(data, formatterDTa);	
//	System.out.println("День: "+lda.getDayOfMonth());
//	

}
