package by.academy.finalwork.domen;

import java.util.Objects;

public class CargoPlain extends Plain {
	
	private double volumeOfCompartment;
	
	public CargoPlain () {
		super();
	}
	
	public CargoPlain (String name,String type,double length, int capacity,double carrying, double flightRange, double fuelUse,double maxWeight) {
		super (name, type, length, capacity, carrying, flightRange, fuelUse, maxWeight);
	}

	public double getVolumeOfCompartment() {
		return volumeOfCompartment;
	}

	public void setVolumeOfCompartment(double volumeOfCompartment) {
		this.volumeOfCompartment = volumeOfCompartment;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", type=" + type + ", length=" + length + ", capacity=" + capacity + ", carrying="
				+ carrying + ", flightRange=" + flightRange +", fuelUse=" + fuelUse + ", maxWeight=" + maxWeight + "]\n";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(volumeOfCompartment);
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
		return Double.doubleToLongBits(volumeOfCompartment) == Double.doubleToLongBits(other.volumeOfCompartment);
	}
}
