package by.academy.lesson10;

public class Vehicle {
	protected String type;
	protected String fuel;
	protected double height;
	protected double width;
	protected double length;
	
	
	public Vehicle(double height, double width, double length) {
		super();
		this.height = height;
		this.width = width;
		this.length = length;
	}
	
	public double getVolume() {
		return height*width*length;
	}
	
}
