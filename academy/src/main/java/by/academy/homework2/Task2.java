package by.academy.homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Введите число n (количество слов): ");
		if (sc.hasNextInt()) {
			int n=sc.nextInt();
			String [] array=new String [n];
			System.out.println("Введите cлова: ");
//			
		for (int i=0;i<=n-1; i++ ) {		
			String str=sc.next();
			array[i]=str;			
		}
//		for (int i=0;i<=n-1; i++ ) {
			System.out.println(Arrays.toString(array));
//		}
		for (int i=0;i<=n-1; i++ ) {
			System.out.println(array[i]);
		}			
		}
		else {
			System.out.println("Необходимо ввести символ типа int");
		}
		sc.close();
	}
}
