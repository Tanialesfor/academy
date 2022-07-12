package by.academy.deal;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Deal {
	
	private User seller;
	private User buyer;
	private Product[] products;
	private LocalDateTime buyTime;
							
		public Deal() {
			super();
		}
		
		public void setSeller(User seller) {
			this.seller = seller;
		}
		public User getSeller() {
			return seller;
		}
		
		public void setBuyer(User buyer) {
			this.buyer = buyer;
		}
		public User getBuyer() {
			return buyer;
		}
		
		public void setProducts(Product[] products) {
			this.products = products;
		}
		public Product[] getProducts() {
			return products;
		}		
		
		public void deal() {
			double summ=0;
			for (Product element:products) {
				summ+=element.getProductPrice();
			}
			double buyerMoney=buyer.getMoney()-summ;
			buyer.setMoney(buyerMoney);
			
			double sellerMoney=seller.getMoney()+summ;
			seller.setMoney(sellerMoney);
		}
		
		public Deal(User seller, User buyer, Product[] products) {
			super();
			this.seller = seller;
			this.buyer = buyer;
			this.products = products;
		}
		public String toString() {
			return this.buyer+" "+this.seller+" "+this.products;
		}
		
//		public void Check () {
//			System.out.println("Продавец: "+this.seller);			
//			System.out.println("Покупатель: "+this.buyer);
//			System.out.println("Время покупки: "+this.buyTime);
//			for (Product element: products) {
//				System.out.println("Товар: "+element.getName()+" Цена:"+element.getPrice());
//			}			
//		}
}

