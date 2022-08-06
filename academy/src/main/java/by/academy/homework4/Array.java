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
	private int index=0;

	public Array () {
		super();
		this.array= (T []) new Object[16];
	}
	
	public Array(int size) {
		this.array=(T []) new Object[size]; 
	}
	
	void grow() {
		int newLength=(int)(array.length==0 ? 1:array.length*1.5);
		T[] newArray= (T[]) new Object [newLength];
		System.arraycopy(array, 0, newArray, 0, array.length);
		array=newArray;
	}
	
	public void add(T obj) {
		if(index==array.length) {
			grow();
		}
		array[index++]=obj;
	}
		
	public void getElementofIndex (int i) {
		if (i >= this.index || i < 0) {
			System.out.println("Элемента с таким индексом не существует."); 
		} else {
			System.out.println(array[i]);
		}
	}
	
	public T getLast() {
		return (T) array[index-1];
    } 
	
	public T getFirst() {
 		return (T) array[0];
	}
	
	public int getSize() {
		return array.length;
	}
	
	public int getLastElement() {
		return index-1;
	}
	
	public void remove(int i) {
		if(i<0 || i>=this.index) {
			System.out.println("Удаление не возможно");
			return;
		}		
		System.arraycopy(array, i+1, array, i, array.length-i-1);
		array[index--]=null;
	}
	public void removeObj(T obj) {
		for (int i=0; i<this.index;i++) {
			if (array[i]==obj) {
				System.arraycopy(array, i+1, array, i, array.length-i-1);
				array[index--]=null;
				return;
			}
		}
		System.out.println("Объект obj отсутствует в массиве array");		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(array);
		result = prime * result + Objects.hash(index);
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
		return Arrays.deepEquals(array, other.array) && index == other.index;
	}

	@Override
	public String toString() {
		return "Array [array=" + Arrays.toString(array) + "]";
	}			  	
}
