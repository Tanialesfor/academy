package by.academy.deal;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		User user2= new User ();
		
		Wine wine=new Wine("Вино Riesling", 25, 4, 2, "белое");
//		Wine wine2=new Wine("Вино Vina Maipo", 35, 1, 2, "белое");
		Cheese cheese=new Cheese ("Сыр Mascarpone", 5.6, 5, "Republic of Belarus", 0.78);
//		Cheese cheese2=new Cheese ("Сыр Сливочный", 3.29, 1, "Republic of Belarus", 0.65);
		Fruit fruit= new Fruit ("Фрукт Бананы", 4.50, 5, "неспелые", 2.5);
//		Fruit fruit2= new Fruit ("Фрукт Яблоки", 3.25, 6, "спелые", 1.5);
		Product bread= new Product ("Хлеб Нарочанский", 2.35, 2);
		Product milk= new Product ("Молоко Белакт", 3.24, 1);
		Product chocolate= new Product ("Шоколад Аленка", 3.70, 3);
		Product cookie= new Product ("Печенье Слодыч", 1.15, 4);
		Product yogurt= new Product ("Йогурт Активиа", 2.55, 1);
		Product sausage= new Product ("Колбаса Пражская", 7.46, 1);
		
//		Product[] productMenu = new Product[9];
//		Deal deal = new Deal();
//		deal.setProducts(productMenu);
		String [] productMenu=new String[9];
		productMenu[0]=wine.getName();
		productMenu[1]=cheese.getName();
		productMenu[2]=fruit.getName();
		productMenu[3]=bread.getName();
		productMenu[4]=milk.getName();
		productMenu[5]=chocolate.getName();
		productMenu[6]=cookie.getName();
		productMenu[7]=yogurt.getName();
		productMenu[8]=sausage.getName();
		
		for (int i=0; i<9; i++)	{
			System.out.println(productMenu[i]);
			i++;	
			}
			
		
		
		
		
		Scanner sc= new Scanner(System.in);
		
//		System.out.println("Введите количество товаров вашей покупки:");
//		int n=sc.nextInt();
//		Product [] 
//		System.out.println("Введите номер товара из меню:");
//		
//		System.out.println("Введите необходимое количество данного товара:");
//		
//		System.out.println("Введите ваше имя:");
//		User user= new User ();
//		user.setNickname()=sc.next();
//		System.out.println("Введите дату вашего рождения согласно шаблону dd/MM/yyyy(dd-MM-yyyy):");
		
		
//		wine.print();
//		System.out.println(wine.getDiscount());
//		System.out.println(wine.getFullPrice());
//		System.out.println(wine.getProductPrice());
//		
//		cheese.print();
//		System.out.println(cheese.getDiscount());
//		System.out.println(cheese.getFullPrice());
//		System.out.println(cheese.getProductPrice());
//		
//		fruit.print();
//		System.out.println(fruit.getDiscount());
//		System.out.println(fruit.getFullPrice());
//		System.out.println(fruit.getProductPrice());
//		System.out.println(fruit.toString());
		
		
		
		
		
			
//		RegexDeal t = new RegexDeal("12.01.1698");
//		System.out.println(t.result);
//		
//		RegexDeal t2 = new RegexDeal("12/01/1698");
//		System.out.println(t2.result);
//		
//		RegexDeal t3 = new RegexDeal("12-01-1698");
//		System.out.println(t3.result);		
		
		sc.close();
	}
}
