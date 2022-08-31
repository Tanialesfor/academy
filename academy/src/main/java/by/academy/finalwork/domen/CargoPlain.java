package by.academy.finalwork.domen;

import java.util.Objects;

public class CargoPlain extends Plain {
	
	private double fuelUse;
	private double maxWeight;
	private double volumeOfCompartment;
	
	public CargoPlain () {
		super();
	}
	
	public CargoPlain (String name,String type,double length, int capacity,double carrying, double flightRange, double fuelUse,double maxWeight) {
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

	public double getVolumeOfCompartment() {
		return volumeOfCompartment;
	}

	public void setVolumeOfCompartment(double volumeOfCompartment) {
		this.volumeOfCompartment = volumeOfCompartment;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(fuelUse, maxWeight, volumeOfCompartment);
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
		CargoPlain other = (CargoPlain) obj;
		return Double.doubleToLongBits(fuelUse) == Double.doubleToLongBits(other.fuelUse)
				&& Double.doubleToLongBits(maxWeight) == Double.doubleToLongBits(other.maxWeight)
				&& Double.doubleToLongBits(volumeOfCompartment) == Double.doubleToLongBits(other.volumeOfCompartment);
	}

	@Override
	public String toString() {
		return "CargoPlain [fuelUse=" + fuelUse + ", maxWeight=" + maxWeight + ", volumeOfCompartment="
				+ volumeOfCompartment + "]";
	}

	
}
