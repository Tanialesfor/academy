package by.academy.homework2;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 
		System.out.println("Введите первую строку: ");
		String str1=sc.next();
		System.out.println("Введите вторую строку: ");
		String str2=sc.next();
			if (( str1.length()-1)%2==0 && (str2.length()-1)%2==0) {		
				System.out.println("Полученное слово: "+str1.substring(0,((str1.length())-1)/2+1)+str2.substring(str2.length()/2));
		}

			else {
			System.out.println("Количество букв в строке должно быть четное");
		}
					
		sc.close();
	}
}
