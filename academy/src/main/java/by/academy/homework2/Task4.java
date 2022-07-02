package by.academy.homework2;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
						
		System.out.println("Введите число n (количество пользователей): ");
		if (sc.hasNextInt()) {
			int n=sc.nextInt();
			if (n<0 || n>10) {
				System.out.println("Количество игроков может быть от 1 до 10 включительно");
			} else {
				String [] deck= new String [54];
				String [] arr1= {"пик", "черв", "бубн", "треф"};
				String [] arr2={"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};
				
				for (int i=0; i<arr1.length; i++) {
					for (int j=0; j<arr2.length; j++) {
						deck[i*13+j] = arr2[j]+" "+arr1[i];
					}
				}
				
				deck[52]="Чёрный джокер";
				deck[53]="Красный джокер";
							
//				System.out.println(Arrays.toString(deck));
				for (int i=0; i<deck.length; i++) {
					int k=(int)(Math.random()*54);
					String str=deck[i];
					deck[i]=deck[k];
					deck[k]=str;
				}
//				System.out.println(Arrays.toString(deck));
				for (int c=1; c<=n; c++) {
					System.out.print("Игрок №"+c+": ");
					for (int i=1; i<=5; i++) {
						System.out.print(deck[(c-1)*5+(i-1)]+" | ");
					}
					System.out.println("\n");
				}				
			}				
		}
		else {
			System.out.println("Необходимо ввести символ типа int");
		}	
		sc.close();
	}
}
