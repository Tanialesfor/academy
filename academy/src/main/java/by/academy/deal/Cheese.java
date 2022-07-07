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
}
