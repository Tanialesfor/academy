package by.academy.lesson19.lambda.classwork;

import java.util.function.Function;

public class Task7 {
	public static void main(String... args) {
		Function<Integer, String> checkInt = number -> {
			if (number == 0) {
				return "Ноль";
			}
			return number > 0 ? "Положительное" : "Отрицательное";
		};
		System.out.println(checkInt.apply(0));
	}
}
