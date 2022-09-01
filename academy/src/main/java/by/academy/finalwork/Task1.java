package by.academy.finalwork;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

//Реализуйте метод для выполнения простейшего сжатия строк с использованием счетчика
//повторяющихся символов. 
//Например, строка ааbсссссааа превращается в а2b1с5а3. 
//Если сжатая строка не становится короче исходной,
//то метод возвращает исходную строку. Предполагается, что строка состоит
//только из букв верхнего и нижнего регистра (a-z).

public class Task1 {

	public static String compress(String str) {
		int count=0;
		char [] chararray = str.toCharArray();
		char ch=chararray[0];
		StringBuilder stb = new StringBuilder();		

		for (int i=0;i<chararray.length;i++) {		
			if (ch==chararray[i]) {
				count++;
			}
			else {
				stb.append(ch);
				stb.append(count);
				ch=chararray[i];
				count=1;
			}
		}
		
		stb.append(ch);
		stb.append(count);	
		
		if (str.length()<=stb.length()) 
			return str;
		else return stb.toString();
		
	}	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Введите строку, состоящую только из букв верхнего и нижнего регистра (a-z):");
		String str=sc.next();
		System.out.println(compress(str));	
		sc.close();
	}
}
