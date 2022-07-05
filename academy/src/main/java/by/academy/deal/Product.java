package by.academy.deal;

public class Product {
	
		String nameProduct;
		double price;
		int quantity;
		boolean isTax;
		double salePrice;

		public void setNameProduct (String nameProduct) {
			this.nameProduct=nameProduct;
		}
		public String getNameProdact() {
			return nameProduct;
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
		
		public void Discount(double discount) {
			
		}
		
		public void SalePrice (double salePrice) {
			this.salePrice=price*quantity;
		}
		
		
}
