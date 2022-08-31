package by.academy.homework7;
//Вывести с помощью рефлексии все поля и методы, сначала через 
//getMethod("name")
//getMethods()
//getField("name")
//getFields()
//а затем через 
//getDeclaredMethod("name")
//getDeclaredMethods()
//getDeclaredField("name")
//getDeclaredFields()
//Посмотреть разницу. Просетать все значения через Reflection. (set метод класса Field). 
//Вывести значения полей через Reflection. (get метод класса Field). Вызвать toString через invoke.

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionMain {
	public static void main(String[] args)  {
		
		Person person=new Person();
		User user=new User();
	
		Class <Person> personClass = Person.class;
		Class <User> userClass = User.class;
		
		try {
   			System.out.println("Вывод методов getMethod (name)");
			Method getLoginMethod = userClass.getMethod("getLogin");
			System.out.println(getLoginMethod);
			Method getPasswordMethod = userClass.getMethod("getPassword");
			System.out.println(getPasswordMethod);
			Method getEmailMethod = userClass.getMethod("getEmail");
			System.out.println(getEmailMethod);
			
			System.out.println("Вывод методов getMethods()");
			for (Method mu: userClass.getMethods()) {
				System.out.println(mu);
				}
						
			System.out.println("Вывод полей getField (name)");	
			Field emailField = userClass.getField("email");
			System.out.println(emailField);
			
			System.out.println("Вывод полей getFields()");
			for (Field fu: userClass.getFields()) {
				System.out.println(fu);
				}
						
			System.out.println("Вывод методов getDeclaredMethod (name)");
			Method getPrintUserInfoMethod=userClass.getDeclaredMethod("printUserInfo");
			System.out.println(getPrintUserInfoMethod);
			
			System.out.println("Вывод методов getDeclaredMethods()");
			for (Method mdu: userClass.getDeclaredMethods()) {
				System.out.println(mdu);
				}
			
			System.out.println("Вывод полей getDeclaredField (name)");
			Field loginField = userClass.getDeclaredField("login");
			System.out.println(loginField);
			Field passwordField = userClass.getDeclaredField("password");
			System.out.println(passwordField);
						
			System.out.println("Вывод полей getDeclaredFields()");
			for (Field fdu: userClass.getDeclaredFields()) {
				System.out.println(fdu);
				}
			for (Field fdp: personClass.getDeclaredFields()) {
				System.out.println(fdp);
				}
			
			System.out.println("Ловим ошибку:");
			Field lastNameField = userClass.getField("lastName");
			System.out.println(lastNameField);
				
		} catch (NoSuchMethodException | NoSuchFieldException | SecurityException e) {
			System.out.println("Метод/поле не найдено" + e);
		}
		
		try {
			Field loginField = userClass.getDeclaredField("login");
			loginField.setAccessible(true);
			loginField.set(user, "1258923gh");		
			System.out.println("Значение поля login: " + loginField.get(user));
			
			Field passwordField = userClass.getDeclaredField("password");
			passwordField.setAccessible(true);
			passwordField.set(user, "158gjty589");		
			System.out.println("Значение поля password: " + passwordField.get(user));
			
			Field emailField = userClass.getDeclaredField("email");
			emailField.set(user, "fgjhfisf@gmail.com");		
			System.out.println("Значение поля email: " + emailField.get(user));
								
			Field firstNameField = personClass.getDeclaredField("firstName");
			firstNameField.set(person, "Anet");		
			System.out.println("Значение поля firstName: " + firstNameField.get(person));
			
			Field lastNameField = personClass.getDeclaredField("lastName");
			lastNameField.setAccessible(true);
			lastNameField.set(person, "Horas");		
			System.out.println("Значение поля lastName: " + lastNameField.get(person));
			
			Field ageField = personClass.getDeclaredField("age");
			ageField.set(person, 22);		
			System.out.println("Значение поля age: " + ageField.get(person));
			
			Field dateOfBirthField = personClass.getDeclaredField("dateOfBirth");
			dateOfBirthField.set(person, "30/08/2000");		
			System.out.println("Значение поля dateOfBirth: " + dateOfBirthField.get(person));
			
			System.out.println("Вызов toString через invoke:");
			Method toStringMethod=userClass.getMethod("toString");
			System.out.println(toStringMethod.invoke(user));
								
		} catch (NoSuchFieldException | NoSuchMethodException| SecurityException | IllegalArgumentException | IllegalAccessException | InvocationTargetException  e) {
			e.printStackTrace();
		}
	}
}
