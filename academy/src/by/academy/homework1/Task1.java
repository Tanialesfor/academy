package by.academy.homework1;

import java.util.Scanner;

public class Task1 {
	public static void main (String[] args) {
		int discountpercent;
		double totalsum;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Введите сумму покупки: ");
		if (sc.hasNextDouble()) {
			double sum=sc.nextDouble();
			if (sum<=0) {
				System.out.println("Сумма может быть только положительным числом");			
			}
			else {
				System.out.println("Введите возвраст: ");
				if (sc.hasNextInt()) {
					int age=sc.nextInt();
					if (age<=0) {
						System.out.println("Возраст может быть только положительным числом");
					}
					else {
						if (sum<100) {
							discountpercent=5;
							totalsum=sum*(100-discountpercent);
							System.out.println("Финальная цена: "+totalsum);
						}	
						else if (sum>=100 && sum<200) {
							discountpercent=7;
							totalsum=sum*(100-discountpercent);
							System.out.println("Финальная цена: "+totalsum);
						}	
						else if (sum>=200 && sum<300) {
							if (age>18){
								discountpercent=16;
								totalsum=sum*(100-discountpercent);
								System.out.println("Финальная цена: "+totalsum);
							}
							else {
								discountpercent=9;
								totalsum=sum*(100-discountpercent);
								System.out.println("Финальная цена: "+totalsum);
							}	
						}	
						else if (sum>=300 && sum<400) {
							discountpercent=15;
							totalsum=sum*(100-discountpercent);
							System.out.println("Финальная цена: "+totalsum);
						}
						else if (sum>=400) {
							discountpercent=20;
							totalsum=sum*(100-discountpercent);
							System.out.println("Финальная цена: "+totalsum);
						}	
					}
				}	
				else {
					System.out.println("Необходимо вводить только цифры");
				}	
			}	
		}			
		else {
			System.out.println("Необходимо вводить только цифры");	
		}	
		sc.close();		
	}
}