package by.academy.lesson5;

public class Task1 {
	public static void main(String[] args) {
		String str="I like Java!!!";
		System.out.println(str.charAt(10));
		System.out.println(str.endsWith("!!!"));
		System.out.println(str.startsWith("I like"));
		System.out.println(str.contains("Java"));
		System.out.println(str.indexOf("Java"));
		System.out.println(str.replace("a", "o"));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.substring(7, 11));
//		System.out.println(str.substring(7));		
	}
}
