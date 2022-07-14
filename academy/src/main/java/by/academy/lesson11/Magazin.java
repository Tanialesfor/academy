package by.academy.lesson11;

public class Magazin implements Printable{
private String name;

	@Override
	public void print() {
	System.out.println("MAGAZIN");
	}
	
	public Magazin(String name) {
	super();
	this.name=name;
	}
	
public static void printMagazines(Printable[] printable) {
	
}
}
