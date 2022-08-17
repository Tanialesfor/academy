package by.academy.homework5;

//Можно писать все в main. Не нужно создавать новых классов.
//Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList. 
//Напишите еще один метод, который выбирает из заполненного списка элемент наугад 100000 раз. 
//Замерьте время, которое потрачено на это. 
//Сравните результаты и предположите, почему они именно такие.

import java.util.LinkedList;
import java.util.ArrayList;

public class Task2 {
	public static void main(String[] args) {
		
		ArrayList <Integer> arrayList=new ArrayList<>();
		LinkedList <Integer> linkedList=new LinkedList<>();

		final int a = 1_000_000;
        final int b = 100_000;
	        for (int i = 0; i < a; i++) {
	            arrayList.add((int)Math.random()*10+1);
	            linkedList.add((int)Math.random()*10+1);
	        }
        
		        long startTime1 = System.currentTimeMillis();
		        for (int i = 0; i < b; i++) {
		            arrayList.get((int) (Math.random() * (a - 1)));
		        }
		        long endTime1=System.currentTimeMillis();
		        System.out.println("Время выполнения программы для ArrayList: " + (endTime1-startTime1)+" ms");

        
			        long startTime2 = System.currentTimeMillis();
			        for (int i = 0; i < b; i++) {
			            linkedList.get((int) (Math.random() * (a - 1)));
			        }
			        long endTime2=System.currentTimeMillis();
			        System.out.println("Время выполнения программы для LinkedList: " + (endTime2-startTime2)+" ms");
				}
}
