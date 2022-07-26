package by.academy.lesson13;
//9.	Написать класс Калькулятор (необобщенный), который содержит обобщенные статические 
//методы - sum, multiply, divide, subtraction. Параметры этих методов  - два числа разного 
//типа, над которыми должна быть произведена операция.

public class Calculator {
	
	public static <T extends Number, V extends Number> double sum(T t, V v) {
		double sum=t.doubleValue()+v.byteValue();
		return sum; 
	}
	public static <T extends Number, V extends Number> double multiply(T t, V v) {
		double multiply=t.doubleValue()*v.byteValue();
		return multiply; 
	}
	public static <T extends Number, V extends Number> double divide(T t, V v) {
		double divide=t.doubleValue()/v.byteValue();
		return divide; 
	}
	public static <T extends Number, V extends Number> double subtraction(T t, V v) {
		double subtraction=t.doubleValue()-v.byteValue();
		return subtraction; 
	}
	public static void main(String[] args) {
//		Calculator calculator=new Calculator(); так как методы static не создаем объекты класса,
//		обращаемся сразу к классу
		System.out.println(Calculator.sum(2.55, 2));
		System.out.println(Calculator.multiply(2.55, 2));
		System.out.println(Calculator.divide(2.55, 2));
		System.out.println(Calculator.subtraction(2.55, 2));
	}
}
	
