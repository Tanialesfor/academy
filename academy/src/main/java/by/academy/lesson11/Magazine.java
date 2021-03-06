package by.academy.lesson11;

public class Magazine implements Printable{
	private String name;

	public Magazine (String name) {
		super();
		this.name=name;
	}
	
	@Override
	public void print() {
		System.out.println("MAGAZINE "+name);
	}
	
		public static void printMagazines (Printable[] printable) {
		for (Printable p:printable) {
			if (p instanceof Magazine) {
				p.print();
		}
	}
}
}
