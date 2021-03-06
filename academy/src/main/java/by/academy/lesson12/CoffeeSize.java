package by.academy.lesson12;

public enum CoffeeSize {
	BIG(100, "B"), HUGE(200, "H"), OVERWHELMING(300, "O"), SMALL(500, "S");

//	public class CoffeeSize5 {
//		public static final String BIG = "BIG";
//		public static final String HUGE = "HUGE";
//		public static final String OVERWHELMING = "OVERWHELMING";
//	}
	
	private final int ml;
	private final String alias;

	CoffeeSize(int ml, String alias) {
		this.ml = ml;
		this.alias = alias;
	}

	public int getMl() {
		return ml;
	}

	public String getAlias() {
		return alias;
	}

	public void doSmth() {
		System.out.println(this.alias + " Hello world");
	}

	public String toString1() {
		return "Hello world" + this.alias;
	}
}
