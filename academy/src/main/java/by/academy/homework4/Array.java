package by.academy.homework4;

import java.util.Arrays;
import java.util.Objects;

import by.academy.deal.Product;

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
	private int size;
	private int index=0;

	public Array () {
		super();
		this.array= (T []) new Object[16];
	}
	
	public Array(int size) {
		this.size = size;
		this.array=(T []) new Object[size]; 
	}
	
	void grow() {
		int newLength=(int)(array.length==0 ? 1:array.length*1.5);
		T[] newArray= (T[]) new Object [newLength];
		System.arraycopy(array, 0, newArray, 0, array.length);
		array=newArray;
	}
	
	public void addArray(T obj) {
		if(index==array.length) {
			grow();
		}
		array[index]=obj;
		index++;
	}
		
	
	public void getElementofIndex (int index) {
		for (int i = 0; i < array.length; i++) {
			if (index == i) {
				if (index >= array.length || index < 0) {
			System.out.println("Элемента с таким индексом не существует."); 
				}
				System.out.println(Arrays.toString((T[]) array[i]));
			}
		}
	}
	
	public T getLast() {
		 		return  (T) array[array.length-1];
   } 
	
	public T getFirst() {
 		return  (T) array[0];
	}
	
	public int getSize() {
		return array.length;
	}
	
	public int getLastElement() {
		int last = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				last = i - 1;
			}
		}
		return last;
	}
	
	public void removeArray(int index) {
		for(int i=array.length-1; i>=0; i--) {
			if (array[i]!=null) {
				index=i+1;
				break;
			}
		}
		if(index<0 || index>=array.length) {
			System.out.println("Удаление не возможно");
			return;
		}		
		for (int i=0; i<array.length;i++) {
			if (index==i) {
				System.arraycopy(array, i+1, array, i, array.length-i-1);
				array[index-1]=null;
				index=index-1;
				break;
			}
		}
	}
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(array);
		result = prime * result + Objects.hash(size);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Array other = (Array) obj;
		return Arrays.deepEquals(array, other.array) && size == other.size;
	}

	@Override
	public String toString() {
		return "Array [array=" + Arrays.toString(array) + ", size=" + size + "]";
	}    
	
	
	
	
    
}
