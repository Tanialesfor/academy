package by.academy.lesson10;

public class StaticMethodDemo {
	public static void main(String[] args) {

		StaticMethodClass.staticMethod(42);

		StaticMethodClass c = new StaticMethodClass();
		c.nonStaticMethod();
	}
}
