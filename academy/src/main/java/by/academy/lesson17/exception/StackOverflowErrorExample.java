package by.academy.lesson17.exception;

public class StackOverflowErrorExample {
	public static void main(String[] args) {
		System.out.println("1");
		main(args);
	}
}
