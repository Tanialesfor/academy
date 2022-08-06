package by.academy.homework4;

import java.util.List;

public class ArrayMain {
	public static void main(String[] args) {
		
		Array<Integer> array=new Array<Integer>(5);
		
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		array.add(6);
	    System.out.println("Массив: "+array);
		
		array.getElementofIndex(2);
				
		System.out.println("Вывод первого элемента : "+array.getFirst());
				
		System.out.println("Вывод последнего элемента : "+array.getLast());
		
		System.out.println("Вывод индекса последнего элемента массива : "+array.getLastElement());
				
		System.out.println("Вывод размера массива : "+array.getSize());
		
		array.remove(1);
		System.out.println("Вывод массива после удаления элемента по индексу : "+array);
		
		array.removeObj(5);
		System.out.println("Вывод массива после удаления элемента : "+array);

	}
}
