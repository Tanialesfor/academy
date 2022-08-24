package by.academy.lesson21;

public class DemoEnclosingMethod {
	public static void main(String[] args) throws ClassNotFoundException {

		class Street {
		}

		System.out.println(Street.class.getEnclosingClass());
	}
}
