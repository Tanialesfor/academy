package by.academy.deal;

public class Product {
	
		protected String name;
		protected double price;
		protected int quantity;
		protected boolean isTax;
//		double salePrice;

		public Product () {
			super ();
		}
		public void setName (String name) {
			this.name=name;
		}
		public String getName() {
			return name;
		}
		public void setPrice (double price) {
			this.price=price;
		}
		public double getPrice() {
			return price;
		}
		public void setQuantity (int quantity) {
			this.quantity=quantity;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setIsTax (boolean isTax) {
			this.isTax=isTax;
		}
		public boolean getIsTaxy() {
			return isTax;
		}
		
		
		public double discount() {
			if (quantity>=2) {
				return 0.5;
			}
			else {
				return 1;
			}
		}
		
		public double salePrice(int quantity, double price) {
			return quantity*price;
		}
		
		
}
