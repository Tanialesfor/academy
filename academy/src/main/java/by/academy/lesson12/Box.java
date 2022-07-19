package by.academy.lesson12;

public class Box<T> {
	private T [] item;
	
	@SuppressWarnings("unchecked")
	public Box() {
		super();
		this.item=(T[]) new Object[10];
	}
	public Box(T[] item) {
		this.item=item;
	}
	public T[] getItem() {
		return item;
	}
	public void setItem(T[] item) {
		this.item=item;
	}
}
