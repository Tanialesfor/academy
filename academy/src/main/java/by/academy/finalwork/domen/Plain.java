package by.academy.finalwork.domen;

import java.util.Objects;


public abstract class Plain {
	
	protected String name;
	protected String type;
	protected double length;
	protected int capacity;
	protected double carrying;
	protected double flightRange;
	
	public Plain () {}
	
	public Plain (String name,String type, double length, int capacity, double carrying, double flightRange) {
		super();
		this.name = name;
		this.type = type;
		this.length = length;
		this.capacity = capacity;
		this.carrying = carrying;
		this.flightRange = flightRange;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getCarrying() {
		return carrying;
	}

	public void setCarrying(double carrying) {
		this.carrying = carrying;
	}

	public double getFlightRange() {
		return flightRange;
	}

	public void setFlightRange(double flightRange) {
		this.flightRange = flightRange;
	}

	@Override
	public int hashCode() {
		return Objects.hash(capacity, carrying, flightRange, length, name, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plain other = (Plain) obj;
		return capacity == other.capacity
				&& Double.doubleToLongBits(carrying) == Double.doubleToLongBits(other.carrying)
				&& Double.doubleToLongBits(flightRange) == Double.doubleToLongBits(other.flightRange)
				&& Double.doubleToLongBits(length) == Double.doubleToLongBits(other.length)
				&& Objects.equals(name, other.name) && Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "Plain [name=" + name + ", type=" + type + ", length=" + length + ", capacity=" + capacity
				+ ", carrying=" + carrying + ", flightRange=" + flightRange + "]";
	}

	
}
	
