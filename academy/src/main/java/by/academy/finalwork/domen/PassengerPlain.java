package by.academy.finalwork.domen;

import java.util.Objects;

public class PassengerPlain extends Plain{
	
	private double fuelUse;
	private double maxWeight;
	private int countEngine;
	
	public PassengerPlain () {
		super();
	}
	
	public PassengerPlain (String name,String type,double length, int capacity, double carrying, double flightRange, double fuelUse,double maxWeight) {
		super (name, type, length, capacity, carrying, flightRange );
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

	public int getCountEngine() {
		return countEngine;
	}

	public void setCountEngine(int countEngine) {
		this.countEngine = countEngine;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(countEngine, fuelUse, maxWeight);
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
		PassengerPlain other = (PassengerPlain) obj;
		return countEngine == other.countEngine
				&& Double.doubleToLongBits(fuelUse) == Double.doubleToLongBits(other.fuelUse)
				&& Double.doubleToLongBits(maxWeight) == Double.doubleToLongBits(other.maxWeight);
	}

	@Override
	public String toString() {
		return "PassengerPlain [fuelUse=" + fuelUse + ", maxWeight=" + maxWeight + ", countEngine=" + countEngine + "]";
	}

	
		
}
