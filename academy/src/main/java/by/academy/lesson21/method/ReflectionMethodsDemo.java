package by.academy.lesson21.method;

import java.lang.reflect.Method;

import by.academy.lesson21.Car;


public class ReflectionMethodsDemo {
	public static void main(String[] args) {
// 		example 1
		System.out.println("example 1");
		Class<Car> carClass = Car.class;
		Method[] declaredMethods = carClass.getDeclaredMethods();
		for (Method method : declaredMethods) {
			System.out.println(method);
		}

// 		example 2
		System.out.println("example 2");
		try {
			Method printSerialNumberMethod = carClass.getDeclaredMethod("printSerialNumber");
			System.out.println(printSerialNumberMethod);

			Method setHorsepowerMethod = carClass.getDeclaredMethod("setHorsepower", int.class);
			System.out.println(setHorsepowerMethod);

			carClass.getDeclaredMethod("dodooooo");
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

// 		example 3
		System.out.println("example 3");

//		Class<Car> carClass = Car.class;
		Method[] methods = carClass.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}

//		example 4
		System.out.println("example 4");
		try {
			Method getHorsepowerMethod = carClass.getMethod("notifyAll");
			System.out.println(getHorsepowerMethod);

			Method printSerialNumberMethod = carClass.getMethod("printSerialNumber");
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

	}

}
