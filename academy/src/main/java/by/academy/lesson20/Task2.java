package by.academy.lesson20;
//Создать лямбда выражение, которое возвращает значение true, если строка не null, используя 
//ункциональный интерфейс Predicate.

import java.util.function.Predicate;

public class Task2 {
	public static void main(String[] args) {
		Predicate <String> p1=str-> str.contains("hdsf");
		System.out.println(p1.test("djgkjkhk"));
	
		Predicate <String> p=str-> str!=null;
	    System.out.println(p.test("djgkjkhk"));
}
}