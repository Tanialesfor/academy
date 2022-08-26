package by.academy.lesson19.lambdaE;

@FunctionalInterface
public interface Eatable {
	void doSomething(Car car);

	default void doSomething1(Car car) {

	}
}
