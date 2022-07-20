package by.academy.deal;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Objects;
import java.time.LocalDate;

public class Deal {
	
	private User seller;
	private User buyer;
	private Product[] products;
	private LocalDateTime buyTime;
	private LocalDate deadLineDate;
	private double summ;
	private int index=0;						
		

	public Deal() {
			super();
			this.products=new Product[10];
		}

	public void setProducts(Product[] products) {
		this.products = products;
	}
	public Product[] getProducts() {
		return products;
	}		
	
	public void deal() {
		this.summ=0;
		for (int i=0; i<index;i++) {
			this.summ+=products[i].getCalcFinalPrice();
		}		
//		for (Product element:products) {
//			summ+=element.getCalcFinalPrice();
//		}
		double buyerMoney=buyer.getMoney()-summ;
		buyer.setMoney(buyerMoney);
		
		double sellerMoney=seller.getMoney()+summ;
		seller.setMoney(sellerMoney);
		
		this.deadLineDate = LocalDate.now().plusDays(10);
	}
		    	
	
	
	public Deal(User seller, User buyer, Product[] products) {
		super();
		this.seller = seller;
		this.buyer = buyer;
		this.products = products;
		this.index=products.length;
		this.deadLineDate = LocalDate.now().plusDays(10);
	}
	
	
	void grow() {
		int newLength=(int)(products.length==0 ? 1:products.length*1.5);
		Product[] newProducts=new Product[newLength];
		System.arraycopy(products, 0, newProducts, 0, products.length);
		products=newProducts;
	}
	
	public Product getProduct (int productIndex) {
		return products[productIndex];
	}
		
	public void addProduct(Product product) {
		if(index==products.length) {
			grow();
		}
		products[index]=product;
		index++;
	}
	
	public void removeProduct(Product product) {
		System.out.println(index);
		for(int i=products.length-1; i>=0; i--) {
			if (products[i]!=null) {
				index=i+1;
				break;
			}
		}
		System.out.println(index);		
		if(index<0 || index>=products.length) {
			System.out.println("Данного товара нет в корзине товаров. Удаление не возможно");
			return;
		}		
		for (int i=0; i<index;i++) {
			if (products[i]==product) {
				System.arraycopy(products, i+1, products, i, products.length-i-1);
				products[index-1]=null;
				index=index-1;
				break;
			}
		}
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
			
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(products);
		result = prime * result + Objects.hash(buyer, seller);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deal other = (Deal) obj;
		return Objects.equals(buyer, other.buyer) && Arrays.equals(products, other.products)
				&& Objects.equals(seller, other.seller);
	}

	public String toString() {
		return this.buyer+" "+this.seller+" "+this.products;
	}
	
		public void check () {
			System.out.println("Итоговый чек:");
			System.out.println("Продавец: "+seller.getNickname());			
			System.out.println("Покупатель: "+buyer.getNickname());
			System.out.println("Время покупки: "+ (this.buyTime=LocalDateTime.now()));

			for (int i=0;i<index;i++) {
				System.out.println("Товар: "+products[i].getName()+":"+" Количество:"+products[i].getQuantity()+" *"+" Цена:"+products[i].getPrice()+" ="+" Стоимость:"+products[i].getCalcFinalPrice());
			}			
			System.out.println("Итоговая сумма сделки: "+this.summ);
			System.out.println("Внесено покупателем: "+(buyer.getMoney()+this.summ));
			System.out.println("Сдача покупателя: "+buyer.getMoney());
			
		}
}

