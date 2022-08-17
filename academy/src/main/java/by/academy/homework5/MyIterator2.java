package by.academy.homework5;

import java.util.Iterator;

public class MyIterator2<T> implements Iterator<T>{
	private Integer [][] array;
	private int i,j;
	
	public MyIterator2 (Integer [][] array) {
		this.array=array;
	}
	
	@Override
	public boolean hasNext() {
		return i<array.length && j<array[i].length;
	}

	@Override
	public T next() {
		Integer newarray=array[i][j++];
		if(j>=array[i].length) {
			i++;
			j=0;
		}
		return (T) newarray;		
	}

}
