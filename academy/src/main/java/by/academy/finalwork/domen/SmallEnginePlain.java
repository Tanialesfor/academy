package by.academy.finalwork.domen;

import java.util.Objects;

public class SmallEnginePlain extends Plain {
	
	private String typeOfEngine; ;
	
	public SmallEnginePlain () {
		super();
	}
	
	public SmallEnginePlain (String name,String type,double length, int capacity, double carrying, double flightRange, double fuelUse,double maxWeight) {
		super (name, type, length, capacity, carrying, flightRange, fuelUse, maxWeight);
	}

	public String getTypeOfEngine() {
		return typeOfEngine;
	}

	public void setTypeOfEngine(String typeOfEngine) {
		this.typeOfEngine = typeOfEngine;
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
		result = prime * result + Objects.hash(typeOfEngine);
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
		return Objects.equals(typeOfEngine, other.typeOfEngine);
	}
}
