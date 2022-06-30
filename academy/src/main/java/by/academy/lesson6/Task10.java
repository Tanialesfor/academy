package by.academy.lesson6;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

//Дана строка “Versions: Java  5, Java 6, Java   7, Java 8, Java 12.”   
//Найти все подстроки "Java <X>" и распечатать их. 

public class Task10 {
	public static void main(String[] args) { 
		String str="Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
		Pattern pattern = Pattern.compile("Java\\s+\\d{1,2}");
		Matcher matcher = pattern.matcher(str);
			while (matcher.find()) {
			System.out.println(matcher.group());
		} 
	}
}