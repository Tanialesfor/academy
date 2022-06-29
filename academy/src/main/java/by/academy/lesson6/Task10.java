package by.academy.lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Дана строка “Versions: Java  5, Java 6, Java   7, Java 8, Java 12.”   
//Найти все подстроки "Java <X>" и распечатать их. 

public class Task10 {
	 public static void main(String[] args) { 
		 String str="Versions: Java  5, Java 6, Java   7, Java 8, Java 12."; 
		 Pattern pattern = Pattern.compile("a*b"); 
	     Matcher matcher = pattern.matcher(str); 
	 }
}