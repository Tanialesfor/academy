package by.academy.lesson17;
//1.	Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
//Login должен содержать только латинские буквы, цифры и знак подчеркивания. Длина login должна быть меньше 
//20 символов. Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException. 
//Password должен содержать только латинские буквы, цифры и знак подчеркивания. Длина password должна быть
//меньше 20 символов. Также password и confirmPassword должны быть равны. Если password не соответствует этим 
//требованиям, необходимо выбросить WrongPasswordException.  WrongPasswordException и WrongLoginException
//- пользовательские классы исключения с двумя конструкторами – один по умолчанию, второй принимает сообщение 
//исключения и передает его в конструктор класса Exception. Обработка исключений проводится внутри метода. 
//Используем multi-catch block. Метод возвращает true, если значения верны или false в другом случае. (Задание с урока)

public class Task1Demo {
	
	public static boolean checkData(String login, String password, String confirmPassword)
			throws WrongLoginException, WrongPasswordException {
		if (login == null) {
			throw new WrongLoginException("Логин не может быть null");
		}
		if (!login.matches("[a-zA-Z0-9_]{1,20}")) {
			throw new WrongLoginException("Логин не соответствует паттерну [a-zA-Z0-9_]{1,20}");
		}

		if (password == null) {
			throw new WrongPasswordException("Пароль не может быть null");
		}
		if (!password.matches("[a-zA-Z0-9_]{1,20}")) {
			throw new WrongPasswordException("Пароль не соответствует паттерну [a-zA-Z0-9_]{1,20}");
		}

		if (!password.equals(confirmPassword)) {
			throw new WrongPasswordException("Пароли не совпадают");
		}
		return true;
	}

//	Обработка исключений проводится внутри метода. 
//	Используем multi-catch block. Метод возвращает true, 
//	если значения верны или false в другом случае. 
	public static void main(String[] args) {
		boolean isValid = validate("++++++++", "qwerty", "querty");
		System.out.println(isValid);
	}

	public static boolean validate(String login, String password, String confirmPassword) {
		try {
			return checkData(login, password, confirmPassword);
		} catch (WrongLoginException | WrongPasswordException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

}