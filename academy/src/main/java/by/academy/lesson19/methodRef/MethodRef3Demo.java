package by.academy.lesson19.methodRef;

import java.util.function.Function;

public class MethodRef3Demo {
	public static void main(String[] args) {
		Function<String, String> function = s -> s.toLowerCase();
		System.out.println(function.apply("OCPJP 8"));

		Function<String, String> function2 = String::toLowerCase;
		System.out.println(function2.apply("OCPJP 8"));

	}

}
