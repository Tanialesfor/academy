package by.academy.lesson13;

public class MinMax<T extends Number> {

	private T[] array;
	
	public MinMax(T[] array) {
		super();
		this.array = array;
	}
	public T min() {
		if (array != null && array.length == 0) {
			return null;
		}
		T min = array[0];
		for (T n : array) {
			if (min.doubleValue() > n.doubleValue()) {
				min = n;
			}
		}

		return min;
	}

	public T max() {
		if (array != null && array.length == 0) {
			return null;
		}
		T max = array[0];
		for (T n : array) {
			if (max.doubleValue() < n.doubleValue()) {
				max = n;
			}
		}

		return max;
	}
	
	public static void main(String[] args) {
		Integer[] intArray = { 1, 5, 7, 2, 8, 2, 4, 6, 8, 2435, 234234, 5345, 23 };

		MinMax<Integer> intMinMax = new MinMax<>(intArray);

		System.out.println(intMinMax.max());
		System.out.println(intMinMax.min());
	}
	
}
