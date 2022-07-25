package by.academy.lesson10;

public class Cat1 extends Animal{
	String color = "red";

	public void mew() {
		System.out.println("Mew!!");
	}

	public void eat() {
		System.out.println("Уже 6 утра!! Давай есть!");
	}

	@Override
	public void live() {
		System.out.println("Кот живет!");
	}
}
