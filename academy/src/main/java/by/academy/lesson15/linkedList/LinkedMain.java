package by.academy.lesson15.linkedList;

public class LinkedMain {
	public static void main(String... args) {
		LinkedListCustom<Integer> custom = new LinkedListCustom<>();
		custom.add(0, 1);
		custom.add(1, 2);
		System.out.println(custom.get(2));
	}
}
