package by.academy.deal;

import java.time.LocalDateTime;

public class Deal {
	
	private User seller;
	private User buyer;
	private Product[] products;
	private LocalDateTime buyTime;
						
		public Deal () {
			
		}
		public double fullPrice (double totalprice) {
			return totalprice;
		}
		public void Check () {
			System.out.println("Продавец: "+this.seller);			
			System.out.println("Покупатель: "+this.buyer);
			System.out.println("Время покупки: "+this.buyTime);
			for (Product element: products) {
				System.out.println("Товар: "+element.getName()+" Цена:"+element.getPrice());
			}			
		}
}

