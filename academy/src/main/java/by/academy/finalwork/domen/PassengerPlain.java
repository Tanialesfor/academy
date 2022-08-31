package by.academy.finalwork.domen;

import java.util.Objects;

public class PassengerPlain extends Plain{
	
	private int countEngine;
	
	public PassengerPlain () {
		super();
	}
	
	public PassengerPlain (String name,String type,double length, int capacity, double carrying, double flightRange, double fuelUse,double maxWeight) {
		super (name, type, length, capacity, carrying, flightRange, fuelUse, maxWeight);
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
		result = prime * result + Objects.hash(countEngine);
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
		return countEngine == other.countEngine;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", type=" + type + ", length=" + length + ", capacity=" + capacity + ", carrying="
				+ carrying + ", flightRange=" + flightRange +", fuelUse=" + fuelUse + ", maxWeight=" + maxWeight + "]\n";
	}
}
