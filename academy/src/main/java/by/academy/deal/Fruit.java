package by.academy.deal;

public class Fruit extends Product{
	
	private String ripeness;
	private double weight;

	public Fruit () {
		super ();
	}
	public void setRipeness (String ripeness) {
		this.ripeness=ripeness;
	}
	public String getRipeness() {
		return ripeness;
	}
	public void setWeight (double weight) {
		this.weight=weight;
	}
	public double getWeight() {
		return weight;
	}
	
	public Fruit (String name, double price, double quantity, String ripeness, double weight) {
		super(name, price, quantity);
		this.ripeness = ripeness;
		this.weight = weight;
	}
	@Override
	public double getDiscount() {
		if (weight>=10) {
			return 0.75;
		}
		else {
			return super.getDiscount();
		}
	} 
	public String toString() {
		StringBuilder stbF = new StringBuilder();
		stbF.append("Фрукт: [название=");
		stbF.append(name);
		stbF.append(", цена=");
		stbF.append(price);
		stbF.append(", количество=");
		stbF.append(quantity);
		stbF.append(", зрелость=");
		stbF.append(ripeness);
		stbF.append(", вес=");
		stbF.append(weight);
		stbF.append("]");
		return stbF.toString();
	}
}
