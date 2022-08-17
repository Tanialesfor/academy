package by.academy.homework5;

//Можно писать все в main. Не нужно создавать новых классов.
//Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList. 
//Напишите еще один метод, который выбирает из заполненного списка элемент наугад 100000 раз. 
//Замерьте время, которое потрачено на это. 
//Сравните результаты и предположите, почему они именно такие.

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class Task2 {

    public static void methodAdd(List <Integer> list) {
        for (int i = 0; i < 1000_000; i++) {
        	int a=(int)(Math.random()*10+1);
        	list.add(a);
        }
    }
    
    public static void methodGet(List <Integer> list) {
        for (int i = 0; i < 100_000; i++) {
        	int b = (int) (Math.random() * (1000_000 - 1));
            list.get(b);
        }
    }    
	
	public static void main(String[] args) {
		
		ArrayList <Integer> arrayList=new ArrayList<>();
		LinkedList <Integer> linkedList=new LinkedList<>();

		methodAdd(arrayList);
		methodAdd(linkedList);
		
        long startTime1 = System.currentTimeMillis();
        methodGet(arrayList);
        long endTime1=System.currentTimeMillis();
        System.out.println("Время выполнения программы для ArrayList: " + (endTime1-startTime1)+" ms");

        long startTime2 = System.currentTimeMillis();
        methodGet(linkedList);
        long endTime2=System.currentTimeMillis();
        System.out.println("Время выполнения программы для LinkedList: " + (endTime2-startTime2)+" ms");
        
        System.out.println("Вывод: время выполнения программы для ArrayList намного короче, чем для LinkedList, "
        		+ "потому что взятие элемента по индексу у ArrayList происходит быстро (это достоинство класса ArrayList),"
        		+ "а взятие элемента по индексу у LinkedList происходит медленно (это один из минусов класса LinkedList). ");
		}
}
