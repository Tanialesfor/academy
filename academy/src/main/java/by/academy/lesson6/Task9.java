package by.academy.lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Изменить регулярное выражение в примере – пусть reference1.org тоже считается ссылкой. 

public class Task9 {
	
			public static void main(String[] args) { 
	        System.out.println(test("google.com")); 
	        System.out.println(test("reference1.org")); 
	        System.out.println(test("reference1.org")); 
	    } 
	 
	    public static boolean test(String testString) { 
	        Pattern pattern = Pattern.compile(".+\\.(com|ua|org)"); 
	        Matcher matcher = pattern.matcher(testString); 
	        return matcher.matches(); 
	        
	    } 
	} 

