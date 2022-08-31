package by.academy.finalwork;

import java.util.Scanner;

//Реализуйте метод для выполнения простейшего сжатия строк с использованием счетчика
//повторяющихся символов. 
//Например, строка ааbсссссааа превращается в а2b1с5а3. 
//Если сжатая строка не становится короче исходной,
//то метод возвращает исходную строку. Предполагается, что строка состоит
//только из букв верхнего и нижнего регистра (a-z).

public class Task1 {
	int count=1; 
	public int compress(String str) {
		for (int i = 0; i < str.length(); i++) {
	        char s = str.charAt(i);
//	        count = 0;
	        for (int j = i+1; j < str.length(); j++) {
	            char s1 = str.charAt(j);
	            if(s==s1){
	                count++;
	            }
	            
	        }
	       return count; 
//	        String newstr=
//        }
//		if(str.length()>newstr.length()) {str=newstr.toString();}
		}
			
	}
//	public String compress(String str) {
//		StringBuilder newstr = new StringBuilder(str);
//		int count=1;	
//		int index=0;
//
//		while (index<newstr.length()) {
//			while (str.charAt(index)==newstr.charAt(index+1)) {
//				count++;
//				newstr.charAt(index+1)=count;
//			}
//		}
//	
//		if(str.length()>newstr.toString().length()) str=newstr.toString();
//		
//		return str;
//	}
	
	
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Введите строку, состоящую только из букв верхнего и нижнего регистра (a-z):");
//	StringBuilder str= new StringBuilder(sc.next());
	String str=sc.next();
	
//	for (int i=0; i<str.length(); i++) {
//			char simvol=str.charAt(i);
//			if (str.indexOf(simvol)>-1) {
//				count++;
//				break;
//			}
//			newstr="simvol"+count;	
//		}
//	   System.out.println(newstr);

	
//				System.out.println(newstr);
//		if (str.length()>newstr.length())
//		return String newstr;
//		else 
//			return str;
		
	Task1 test=new Task1();
	System.out.println(test.compress(str));
	sc.close();
	}
}
