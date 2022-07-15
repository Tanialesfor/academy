package by.academy.lesson11;

public class Book implements Printable {
	private String name;
	
	public Book (String name) {
		super();
		this.name=name;
	}
	@Override
	public void print() {
		System.out.println("BOOK "+name);
	}
	
	public static void printBooks(Printable[] printable) {
		for (Printable p:printable) {
			if (p instanceof Book) {
				p.print();
			}
		}
	}

}
