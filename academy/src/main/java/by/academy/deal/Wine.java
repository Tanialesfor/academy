package by.academy.deal;

import java.util.Objects;

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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(age, color);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wine other = (Wine) obj;
		return age == other.age && Objects.equals(color, other.color);
	}
	
	public String toString() {
		StringBuilder stbW = new StringBuilder();
		stbW.append("Продукт: [название=");
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
