package by.academy.lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task8 {
//	Изменить регулярное выражение в примере для нахождения строк 
//	 cab, ccab, cccab. 
 
	
	    public static void main(String[] args) { 
//	        Pattern pattern = Pattern.compile("a*b"); 
//	        Matcher matcher = pattern.matcher("aaab"); 
//	        boolean b = matcher.matches(); 
//	        System.out.println(b); 
	        
	        Pattern pattern = Pattern.compile("[a-c]*b"); 
	        Matcher matcher1 = pattern.matcher("cab");
	        Matcher matcher2 = pattern.matcher("ccab");
	        Matcher matcher3 = pattern.matcher("cccab");
	        boolean b1 = matcher1.matches();
	        boolean b2 = matcher2.matches();
	        boolean b3 = matcher3.matches();
	        System.out.println(b1); 
	        System.out.println(b2); 
	        System.out.println(b3); 
	    } 
	} 

