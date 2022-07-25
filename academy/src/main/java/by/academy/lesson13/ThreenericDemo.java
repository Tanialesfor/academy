package by.academy.lesson13;

import by.academy.lesson10.Cat;

public class ThreenericDemo {
	public static void main(String[] args) {
		
		
	Threeneric<String, Cat, Integer> demo = new Threeneric<>("Hello", new Cat(), 90);
	System.out.println(demo.getKName());
	System.out.println(demo.getTName());
	System.out.println(demo.getVName());
	
	}
}