package by.academy.deal;

public class Vine extends Product {
	
	private int age;
	private String color;
	
	public Vine () {
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
	@Override
	public  double discount() {
		// TODO Auto-generated method stub
		return super.discount();
	}
	
	 
	
	
	
}
