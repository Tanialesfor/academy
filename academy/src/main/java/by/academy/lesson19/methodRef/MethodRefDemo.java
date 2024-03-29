package by.academy.lesson19.methodRef;

import java.util.function.Consumer;

public class MethodRefDemo {
	public static void main(String[] args) {
		Consumer<String> printer = str -> System.out.println(str);
		printer.accept("Hello there!");

		Consumer<String> printerRef = System.out::println;
		printerRef.accept("Hello from another there!");

	}
}
