package by.academy.lesson4;

import java.util.Random;
import java.util.Arrays;

public class Task_m02 {
	public static void main(String[] args) {
		int[] values = new int[10];   
		for (int i = 0; i < values.length; i++) {        
			values[i] = new Random().nextInt(10);   
			}    
		for (int element:values) {        
			System.out.println(element);   
			}
		}
}
