package by.academy.homework5;

import java.util.ArrayList;
import java.util.ListIterator;

//Создать список оценок учеников с помощью ArrayList, заполнить случайными
//оценками. Найти самую высокую оценку с использованием итератора.

public class Task4 {
	public static void main(String[] args) {
	int size = 20;
		
	ArrayList<Integer> marks = new ArrayList<Integer>();
	    
	    for (int i = 0; i < size; i++){
	 	      int a = (int)(Math.random() * 10 + 1);
	     	  marks.add(i, a);
	    }
	    System.out.println("Список оценок 20 учеников: "+marks);
		
	    ListIterator<Integer> listIterator = marks.listIterator();
	    while (listIterator.hasNext()) {
	        int maxmark=0;
	    	for (Integer element: marks) {
	    		element=listIterator.next();
	    		if (element>maxmark) {
	    		maxmark=element;
	    	    }
	        }
	    System.out.println("Максимальная оценка: "+maxmark);
	    	
	    }
	}
	
}
