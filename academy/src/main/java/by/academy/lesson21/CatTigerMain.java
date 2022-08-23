package by.academy.lesson21;

import java.lang.reflect.Method;
//Создать класс Cat. Создать класс Tiger, наследоваться от Cat. 
//Добавить public, protected, private переменные в оба класса. 
//Добавить public, protected, private методы в оба класса. 
// 
//Создать объект Class для Cat. 
//Создать объект Class для Tiger. 
// 
//Вывести на экран все методы Cat. (private в том числе) - getDeclaredMethods 
//Вывести на экран все методы Tiger. (private в том числе) - getDeclaredMethods 
// 
//Вывести на экран все названия переменных класса Cat. (private в том числе)  - getDeclaredFields 
//Вывести на экран все названия переменных класса Tiger. (private в том числе) - getDeclaredFields
// 
//Изменить 1 переменную класса Cat. (private) 
//Изменить 1 переменную класса Tiger. (не private) 
// 
//Добавить метод run в Tiger с private модификатором доступа, вызвать с помощью invoke(). 

public class CatTigerMain {
	public static void main(String[] args) {
	
	Class<Cat> catClass = Cat.class;
	Class<Tiger> tigerClass = Tiger.class;
	
	for (Method m: catClass.getDeclaredMethods()) {
	System.out.println(m);
	}
	
	
	for (Method m: tigerClass.getDeclaredMethods()) {
		System.out.println(m);
		}
	
	}
}
