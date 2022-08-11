package by.academy.homework5;

import java.util.HashSet;
import java.util.List;

//Можно писать все в main. Не нужно создавать новых классов.
//Напишите метод, который на вход получает коллекцию объектов, а возвращает 
//коллекцию уже без дубликатов.


public class Task1 {
		
	public HashSet <String> changeArray (List <String> arrayList) {
		return new HashSet<>(arrayList);
	}
	
	public static void main(String[] args) {
	
		List<String> arrayList = List.of("C", "A", "E", "B", "D", "F", "A", "E", "B");
		Task1 test=new Task1();
		System.out.println(test.changeArray(arrayList));
		
	}
}
