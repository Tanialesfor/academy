package by.academy.lesson21;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
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
	public static void main(String[] args)  {
	
	Class<Cat> catClass = Cat.class;
	Class<Tiger> tigerClass = Tiger.class;
	
	for (Method mc: catClass.getDeclaredMethods()) {
	System.out.println(mc);
	}
		
	for (Method mt: tigerClass.getDeclaredMethods()) {
		System.out.println(mt);
		}
	
	for (Field fc: catClass.getDeclaredFields()) {
		System.out.println(fc);
		}
			
	for (Field ft: tigerClass.getDeclaredFields()) {
		System.out.println(ft);
		}
	
	Cat cat=new Cat();
	cat.setCodename(2587);
	Tiger tiger=new Tiger();
	tiger.setNickname("Пушок");
	
	try {
		Field codenameField = catClass.getDeclaredField("codename");
		codenameField.setAccessible(true);
		System.out.println("Before change: "+codenameField.get(cat));
		codenameField.set(cat, 2586);		
		System.out.println("After change: " + codenameField.get(cat));
		
		Field nicknameField=tigerClass.getDeclaredField("nickname");
		System.out.println("Before change: " + nicknameField.get(tiger));
		nicknameField.set(tiger, "Рыжик");
		System.out.println("After change: " + nicknameField.get(tiger));
		
		Method runMethod=tigerClass.getDeclaredMethod("run");
		runMethod.setAccessible(true);
		runMethod.invoke(tiger);
		
	} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
		e.printStackTrace();
	}
		
	}
}
