package by.academy.lesson10;

public class ParentBlock {
	static {
		System.out.println("Static block parent");
	}

	{
		System.out.println("block parent");
	}

	public static void printSmth() {
		System.out.println("smth");
	}
}
