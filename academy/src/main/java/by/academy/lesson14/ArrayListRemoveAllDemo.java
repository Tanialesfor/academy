package by.academy.lesson14;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveAllDemo {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();

		arrayList.add("C");
		arrayList.add("A");
		arrayList.add("E");
		arrayList.add("B");
		arrayList.add("D");
		arrayList.add("F");
		arrayList.add("F");
		arrayList.add(1, "A2");
		arrayList.set(0, "C2");

		List<String> removeElements = List.of("C2", "A2", "AA", "F");
		System.out.println("Содержимое arrayList до removeAll: " + arrayList);

		arrayList.removeAll(removeElements);
		arrayList.remove(arrayList.size() - 1);
		arrayList.remove("A");
		arrayList.remove(1);
		System.out.println("Содержимое arrayList после removeAll: " + arrayList);
	}
}
