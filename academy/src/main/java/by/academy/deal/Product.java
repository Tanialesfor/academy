package by.academy.deal;

public class Product {
	
		String name;
		double price;
		int quantity;
		boolean isTax;
//		double salePrice;

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
		
		public double discount(double price) {
			return price;
		}
		
		public double salePrice(int quantity, double price) {
			return quantity*price;
		}
		
		
}
