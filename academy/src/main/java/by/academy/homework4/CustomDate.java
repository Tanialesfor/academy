package by.academy.homework4;

import java.time.LocalDate;
import java.util.Locale;
import java.time.DayOfWeek;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	

	public CustomDate() {
		super();
	}

	@Override
	public String toString() {
		return this.year.x+"/"+this.month.x+"/"+this.day.x;
	}


	public Year getYear() {
		return year;
	}

	public void setYear(Year year) {
		this.year = year;
	}

	public Month getMonth() {
		return month;
	}

	public void setMonth(Month month) {
		this.month = month;
	}

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}

	public LocalDate toLocalDate() {
		return LocalDate.of(this.year.x,this.month.x,this.day.x);
	} 
	
	public void printDayOfWeek() {					
		System.out.println("День недели(номер): "+this.toLocalDate().getDayOfWeek().getValue());
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
	
	
	@Override
		public boolean isValid(String strData) {
			Pattern pattern = Pattern.compile("\\d{2}\\-\\d{2}\\-\\d{4}");
			Matcher matcher = pattern.matcher(strData);	
			if(matcher.find()) {
				return true;
				}
			return false;
		}
	public CustomDate(String strData) {
		
	}
		
		public void isCustomDateValid (String strData) {
		Validator valid=new CustomDate(strData);
		if (valid.isValid(strData)) {
			System.out.println("Введенная строка является датой.");
			
		} else {
			System.out.println("Введенная строка не является датой.");
			
		}
	}
		
		
	}



