package by.academy.deal;

import by.academy.lesson8.Phone;

public class Product {
	
		protected String name;
		protected double price;
		protected double quantity;
		protected boolean isTax;

		public Product () {
				super ();
		}
		
		public Product(String name, double price, double quantity) {
			super();
			this.name = name;
			this.price = price;
			this.quantity = quantity;
		}
		
		public void print() {
			System.out.println("Итого по продукту:");
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
			return 1;
			}
		
		
		public double getFullPrice() {
			return quantity*price;
		}
		
		public double getProductPrice() {
			return price * quantity * getDiscount();
		}
		
		public boolean equals (Product product) {
			System.out.println ("Результат сравнения equals:");
			if (product.getPrice()==product.getFullPrice()) {
				return true;
			} else {
				return false;
			}
		}
		
//		public int hashCode () {
//			return this.hashcode;
//		} 
		
//		public int hashCode() {
//			
//			final int prime = 31;
//			int result = 1;
//			long temp;
//			temp = Double.doubleToLongBits();
//			result = prime * result + (int) (temp ^ (temp >>> 32));
//			temp = Double.doubleToLongBits(height);
//			result = prime * result + (int) (temp ^ (temp >>> 32));
//			temp = Double.doubleToLongBits(width);
//			result = prime * result + (int) (temp ^ (temp >>> 32));
//			return result;
//		}
		
			public String toString() {
			StringBuilder stbP = new StringBuilder();
			stbP.append("Продукт: [название=");
			stbP.append(name);
			stbP.append(", цена=");
			stbP.append(price);
			stbP.append(", количество=");
			stbP.append(quantity);
			stbP.append("]");
			return stbP.toString();
		}
}
