package by.academy.homework4;

import java.util.Arrays;

//Создать класс, который параметризуется любым типом (T). Имеет массив объектов нашего типа T.
//Содержит пустой конструктор, который по дефолту инициализирует пустой массив размерности 16.
//Содержит конструктор, принимающий значение int и инитает им размер нашего массива.
//
//Содержит методы:
//1) добавления в наш массив объекта типа T - add(T obj) (нужно помнить, что если массив заполнен, 
//нам нужно его расширить с помощью Arrays.copyOf)
//2) взятие по индексу get(int i)
//3) взятие последнего элемента getLast()
//4) взятие первого элемента getFirst()
//5) вывод размера массива
//6) вывод индекса последнего заполненого элемента (не путать с размерностью)
//7) удаление элемента по индексу (remove(int i)
//8) удаление элемента по значению (remove(T obj))



public class Array<T> {
	private T[] array;
	private int size=0;

	public Array () {
		super();
		Array <T> [] array = new Array [16];
		// Недопустимо!!!
//		оb = (T) new Object();
//		array = (T[]) new Object[10];
//		this.array= (T []) new Object[16];
	}
	
	public Array(int size) {
		this.size = size;
		Array <T> [] array = new Array [size];
//		this.array=(T []) new Object[size]; 
		
	}
	public T get(int i) {
		 if (i >= size || i < 0) {
			System.out.println("Элемента с таким индексом не существует."); 
		 }
		return  (T) array[i];
    }
	
	public T getLast() {
		 		return  (T) array[size-1];
   } 
	public T getFirst() {
 		return  (T) array[0];
}     
    
}
