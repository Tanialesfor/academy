package by.academy.lesson16.map;

public class Toy {
	private String name;
	private String color;
	private double weight;
	
	
	public Toy (String name, String color, double weight) {
		this.name=name;
		this.color=color;
		this.weight=weight;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	@Override
	public String toString() {
		return "Toy [name=" + name + ", color=" + color + ", weight=" + weight + "]";
	}
	
	
	
	
	} 
