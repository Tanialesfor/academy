package by.academy.finalwork.domen;

import java.util.Objects;

public class SmallEnginePlain extends Plain {
	
	private double fuelUse;
	private double maxWeight;
	private String typeOfEngine; ;
	
	public SmallEnginePlain () {
		super();
	}
	
	public SmallEnginePlain (String name,String type,double length, int capacity, double carrying, double flightRange, double fuelUse,double maxWeight) {
		super (name, type, length, capacity, carrying, flightRange);
		this.fuelUse=fuelUse;
		this.maxWeight=maxWeight;
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

	public String getTypeOfEngine() {
		return typeOfEngine;
	}

	public void setTypeOfEngine(String typeOfEngine) {
		this.typeOfEngine = typeOfEngine;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(fuelUse, maxWeight, typeOfEngine);
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
		SmallEnginePlain other = (SmallEnginePlain) obj;
		return Double.doubleToLongBits(fuelUse) == Double.doubleToLongBits(other.fuelUse)
				&& Double.doubleToLongBits(maxWeight) == Double.doubleToLongBits(other.maxWeight)
				&& Objects.equals(typeOfEngine, other.typeOfEngine);
	}

	@Override
	public String toString() {
		return "SmallEnginePlain [fuelUse=" + fuelUse + ", maxWeight=" + maxWeight + ", typeOfEngine=" + typeOfEngine
				+ "]";
	}

	
}
