package by.academy.deal;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		User user1= new User ();
		User user2= new User ();
		
		Wine wine1=new Wine("Riesling", 25, 4, 2, "белое");
//		Wine wine2=new Wine("Vina Maipo", 35, 1, 2, "белое");
		Cheese cheese1=new Cheese ("Mascarpone", 5.6, 5, "Republic of Belorus", 0.78);
		Fruit fruit1= new Fruit ("Бананы", 4.50, 1, "спелые", 2.5);
		
		
		wine1.print();
		System.out.println(wine1.getDiscount());
		System.out.println(wine1.getFullPrice());
		System.out.println(wine1.getProductPrice());
		
		cheese1.print();
		System.out.println(cheese1.getDiscount());
		System.out.println(cheese1.getFullPrice());
		System.out.println(cheese1.getProductPrice());
		
		fruit1.print();
		System.out.println(fruit1.getDiscount());
		System.out.println(fruit1.getFullPrice());
		System.out.println(fruit1.getProductPrice());
		System.out.println(fruit1.toString());
		
		Product[] productList = new Product[3];
		
		productList[0]=wine1;
		productList[1]=cheese1;
		productList[2]=fruit1;
		
		Deal deal = new Deal();
		deal.setProducts(productList);
		
		System.out.print(Arrays.toString(deal.getProducts()));
		System.out.println();
		
		System.out.println(fruit1.equals(wine1));
		System.out.println(wine1.equals());
		System.out.println(cheese1.equals());
		System.out.println(fruit1.equals());
		
		RegexDeal t = new RegexDeal("12.01.1698");
		System.out.println(t.result);
		
		RegexDeal t2 = new RegexDeal("12/01/1698");
		System.out.println(t2.result);
		
		RegexDeal t3 = new RegexDeal("12-01-1698");
		System.out.println(t3.result);		
	}
}
