package by.academy.homework4;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Objects;
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
	private String strData;
	private final static Pattern pattern = Pattern.compile("\\d{2}\\-\\d{2}\\-\\d{4}");
	

	public CustomDate() {
		super();
	}

	public CustomDate(String strData) {
		this.strData=strData;
		this.year=new Year(Integer.parseInt(strData.substring(6)));
		this.month=new Month(Integer.parseInt(strData.substring(3,5)));
		this.day=new Day(Integer.parseInt(strData.substring(0,2)));
	}
	
	public LocalDate toLocalDate() {
		return LocalDate.of(this.year.value,this.month.value,this.day.value);
	} 
	
	public void printDayOfWeek() {					
		System.out.println("День недели по заданной дате (номер): "+this.toLocalDate().getDayOfWeek().getValue());
	}
	
	
	public class Year{
		int value;
		public Year(int year) {
			this.value=year;
		}
		
		public boolean isleapYear() {
			if (value%4==0) {
				return true;
			} else return false;
		}
	}
	
	public class Month{
		int value;
		String name;
		int daysMonth;
		Year year; 
		
		public Month(int month) {
			this.value=month;
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
                    System.out.println("Месяц введен не верно.");
                    break;
            }
            return daysMonth;
        }		
	}
	public class Day{
		int value;
		String name;
		int dayOfWeek; 
		public Day(int day) {
			this.value=day;
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
	
	public void enumDayOfWeek() {
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
		System.out.println("День недели в виде перечисления: "+this.dayOfWeek.name);		
	}
	
	public CustomDate(int year, int month, int day ) {
		this.year = this.new Year(year);	
		this.month = this.new Month(month);
		this.day = this.new Day(day);
		this.enumDayOfWeek();
	}	
				
	@Override
	public Pattern getPattern() {
		return pattern;
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

		@Override
		public String toString() {
			return this.day.value+"-"+this.month.value+"-"+this.year.value;
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(day, month, year);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			CustomDate other = (CustomDate) obj;
			return Objects.equals(day, other.day) && Objects.equals(month, other.month)
					&& Objects.equals(year, other.year);
		}
		
		
	}



