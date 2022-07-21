package by.academy.lesson10;

public abstract class Creature {
	int age = 0;

	public abstract void live();

	private void die() {
		System.out.println("Не Живем!");
	}
}
