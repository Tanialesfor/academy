package by.academy.lesson16.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

//Создайте HashMap, содержащий пары значений  - 
//имя игрушки и объект игрушки (класс Toy).
//Перебрать и распечатать пары значений - entrySet().
//Перебрать и распечатать набор из имен продуктов  - keySet().
//Перебрать и распечатать значения продуктов - values().
//Для каждого перебора создать свой метод.

public class ToyDemo {
	public static void main(String[] args) {
		Map<String, Toy> map = new HashMap<>();

		map.put("Кукла", new Toy("Маша", "белый", 0.25));
		map.put("Машинка", new Toy("Грузовик", "синий", 0.45));
		map.put("Мячик", new Toy("Футбольный", "белый", 0.30));

		System.out.println(map);
		printKey(map);
		printValue(map);
		printValueAndKey(map);
			
	}

	public static void printKey(Map<String, Toy> map) {
		for (String key : map.keySet()) {
			System.out.println(key);
		}
	}

	public static void printValue(Map<String, Toy> map) {
		for (Toy value : map.values()) {
			System.out.println(value);
		}
	}
	
	
	public static void printValueAndKey(Map<String, Toy> map) {
		for (Entry<String, Toy> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
