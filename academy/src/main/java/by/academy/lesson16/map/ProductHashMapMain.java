package by.academy.lesson16.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

//8.	Создайте HashMap, содержащий пары значений  - имя игрушки и объект игрушки (класс Product).
//Перебрать и распечатать пары значений - entrySet().
//Перебрать и распечатать набор из имен продуктов  - keySet().
//Перебрать и распечатать значения продуктов - values().
//Для каждого перебора создать свой метод.

public class ProductHashMapMain {
	public static void main(String[] args) {
		Map<String, Product> map = new HashMap<>();
		
//		Product toy1 = new Product("Аленка", 12.0, "Беларусь");
//		Product toy2 = new Product("Пожарная", 10.0, "Беларусь");
//		Product toy3 = new Product("Солнышко", 5.6, "Беларусь");
//		Product toy4 = new Product("Радуга", 7.0, "Беларусь");
//		Product toy5 = new Product("Бамблби", 15.2, "Китай");
				

		map.put("Кукла", new Product("Аленка", 12.0, "Беларусь"));
		map.put("Машинка", new Product("Пожарная", 10.0, "Беларусь"));
		map.put("Погремушка", new Product("Солнышко", 5.6, "Беларусь"));
		map.put("Мячик", new Product("Радуга", 7.0, "Беларусь"));
		map.put("Трансформер", new Product("Бамблби", 15.2, "Китай"));
			
		System.out.println(map);

		printKey(map);
		printValue(map);
		printValueAndKey(map);
	}

	public static void printKey(Map<String, Product> map) {
		for (String key : map.keySet()) {
			System.out.println(key);
		}
	}

	public static void printValue(Map<String, Product> map) {
		for (Product value : map.values()) {
			System.out.println(value);
		}
	}

	public static void printValueAndKey(Map<String, Product> map) {
		for (Entry<String, Product> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
			
	}
	
}
