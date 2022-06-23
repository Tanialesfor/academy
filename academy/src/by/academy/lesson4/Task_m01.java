package by.academy.lesson4;

import java.util.Random;
import java.util.Arrays;

public class Task_m01 {
	public static void main(String[] args) {    
		int[] values = new int[10];   
		for (int i = 0; i < values.length; i++) {      
			values[i] = new Random().nextInt(10);   }  
		System.out.println(Arrays.toString(values));
		Arrays.sort(values);   
		System.out.println(Arrays.toString(values));
		}

}
