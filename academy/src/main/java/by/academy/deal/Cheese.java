package by.academy.deal;

public class Cheese extends Product{
	
	private String countryProduce;
	private double richness;

	public Cheese () {
		super ();
	}
	public void setRichness (double richness) {
		this.richness=richness;
	}
	public double getRichness() {
		return richness;
	}
	public void setCountryProduce (String countryProduce) {
		this.countryProduce=countryProduce;
	}
	public String getCountryProduce() {
		return countryProduce;
	}
	
	public Cheese (String name, double price, double quantity, String countryProduce,double richness) {
		super(name, price, quantity);
		this.countryProduce = countryProduce;
		this.richness = richness;
	}
	@Override
	public double getDiscount() {
		if (quantity>=5) {
			return 0.85;
		}
		else {
		return super.getDiscount();
		}
	}
	public boolean equals () {
		System.out.println ("Результат сравнения Cheese equals:");
		if (this.richness!=this.price) {
			return true;
		} else {
			return false;
		}
	}
		
	public String toString() {
		StringBuilder stbC = new StringBuilder();
		stbC.append("Сыр: [название=");
		stbC.append(name);
		stbC.append(", цена=");
		stbC.append(price);
		stbC.append(", количество=");
		stbC.append(quantity);
		stbC.append(", страна производитель=");
		stbC.append(countryProduce);
		stbC.append(", жирность=");
		stbC.append(richness);
		stbC.append("]");
		return stbC.toString();
	}
}


