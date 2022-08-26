package by.academy.lesson19.lambdaE;

@FunctionalInterface
public interface Printable {
	void print(String p);

	boolean equals(Object o);

	int hashCode();

	String toString();
}
