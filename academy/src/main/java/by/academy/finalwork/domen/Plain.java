package by.academy.finalwork.domen;

import java.util.Objects;

public abstract class Plain implements Comparable<Plain>{
	
	protected String name;
	protected String type;
	protected double length;
	protected int capacity;
	protected double carrying;
	protected double flightRange;
	protected double fuelUse;
	protected double maxWeight;
	
	public Plain () {}
	
	public Plain (String name,String type, double length, int capacity, double carrying, double flightRange, double fuelUse, double maxWeight) {
		super();
		this.name = name;
		this.type = type;
		this.length = length;
		this.capacity = capacity;
		this.carrying = carrying;
		this.flightRange = flightRange;
		this.fuelUse = fuelUse;
		this.maxWeight = maxWeight;
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

	public double getFuelUse() {
		return fuelUse;
	}

	public void setFuelUse(double fuelUse) {
		this.fuelUse = fuelUse;
	}

	public double getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(double maxWeight) {
		this.maxWeight = maxWeight;
	}

	@Override
	public int compareTo(Plain plain) {
		return (int) (this.flightRange-plain.flightRange);
	}
	@Override
	public String toString() {
		return "Plain [name=" + name + ", type=" + type + ", length=" + length + ", capacity=" + capacity
				+ ", carrying=" + carrying + ", flightRange=" + flightRange + ", fuelUse=" + fuelUse + ", maxWeight="
				+ maxWeight + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(capacity, carrying, flightRange, fuelUse, length, maxWeight, name, type);
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
				&& Double.doubleToLongBits(fuelUse) == Double.doubleToLongBits(other.fuelUse)
				&& Double.doubleToLongBits(length) == Double.doubleToLongBits(other.length)
				&& Double.doubleToLongBits(maxWeight) == Double.doubleToLongBits(other.maxWeight)
				&& Objects.equals(name, other.name) && Objects.equals(type, other.type);
	}
}
	
