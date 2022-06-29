package by.academy.homework1;

import java.util.Scanner;

public class Task3 {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
				
		System.out.println("Введите целое число от 1 до 10:");
		if (sc.hasNextInt()) {
			int a=sc.nextInt();
			if (a>10 || a<1) {
				System.out.println("Вводимое число должно быть от 1 до 10");	
			}
			else {
				for (int i=1; i<=10; i++) {
					System.out.println(a+"*"+i+"="+a*i);
				}
			}
		}
		else {
			System.out.println("Вводимое значение должно быть типа int");
		}			
		sc.close();	
}
}
