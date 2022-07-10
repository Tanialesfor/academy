package by.academy.deal;

public class Product {
	
		protected String name;
		protected double price;
		protected double quantity;
		protected boolean isTax;

			
		public Product(String type, String name, double price, double quantity) {
			super();
			this.name = name;
			this.price = price;
			this.quantity = quantity;
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
		public void setQuantity (double quantity) {
			this.quantity=quantity;
		}
		public double getQuantity() {
			return quantity;
		}
//		public void setIsTax (boolean isTax) {
//			this.isTax=isTax;
//		}
//		public boolean getIsTaxy() {
//			return isTax;
//		}
				
		public double getDiscount() {
			if (quantity>=2) {
				return 0.2;
			}
			else {
				return 1;
			}
		}
		
		public double getFullPrice() {
			return quantity*price;
		}
		
		public double getProductPrice() {
			return price * quantity * getDiscount();
		}
}
