package by.academy.deal;

public class Wine extends Product {
	
	private int age;
	private String color;
	
	public Wine () {
		super ();
	}
		public void setAge (int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setColor (String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public Wine (String name, double price, double quantity,int age,String color) {
		super(name, price, quantity);
		this.age = age;
		this.color = color;
	}
		
	@Override
	public double getDiscount() {
		if (quantity>=4 || price*quantity>200) {
			return 0.8;
		}
		else {
		return super.getDiscount();
		}
	}
	
	public boolean equals () {
		System.out.println ("Результат сравнения Wine equals:");
		if (this.age!=this.price) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		StringBuilder stbW = new StringBuilder();
		stbW.append("Вино: [название=");
		stbW.append(name);
		stbW.append(", цена=");
		stbW.append(price);
		stbW.append(", количество=");
		stbW.append(quantity);
		stbW.append(", возраст=");
		stbW.append(age);
		stbW.append(", цвет=");
		stbW.append(color);
		stbW.append("]");
		return stbW.toString();
	}
	
	
}
