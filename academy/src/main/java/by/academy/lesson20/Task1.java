package by.academy.lesson20;
//Написать лямбда выражение для интерфейса Printable, который содержит один метод void print().
public class Task1 {
	

	public static void main(String[] args) {
	
		Printable p=str -> System.out.println(str);
		p.print("dhgfsy");
	}
	
}
