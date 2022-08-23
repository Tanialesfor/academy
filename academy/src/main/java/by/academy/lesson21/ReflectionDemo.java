package by.academy.lesson21;

import by.academy.lesson18.Car;

public class ReflectionDemo {
	public static void main(String[] args) {
		//example 1
		try {
		     Class<?> carClass1 = Class.forName("by.academy.lesson18.Car");
		     System.out.println(carClass1);
		} catch (ClassNotFoundException e) {
		    e.printStackTrace();
		}
		//example 2		
		Car car = new Car();
		Class<? extends Car> carClass2 = car.getClass();
		System.out.println(carClass2);
		
        //example 3
		Class<Car> carClass3 = Car.class;
		System.out.println(carClass3);

	}
}
