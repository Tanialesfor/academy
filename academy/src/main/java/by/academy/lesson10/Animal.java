package by.academy.lesson10;

public class Animal  extends Creature{
	public void walk() {
		System.out.println("Гуляем!");
	}

	public void die() {
		System.out.println("Не Живем!");
	}

	@Override
	public void live() {
		System.out.println("Animal live");
	};
}
