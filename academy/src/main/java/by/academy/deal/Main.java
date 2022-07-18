package by.academy.deal;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
				 		
		User user= new User ();
		User user1=new User ();
		User user2=new User ();
		User user3=new User ();
			
		user.setValidPhone("+37623 125-12-56");
		user1.setValidPhone("+37529 579-23-25");
		user2.setValidAmericanPhone("+22356 579-23-25");
		user3.setValidEmail("dfgjrty@ghj.fghytuio");
		
		
		Wine wine1=new Wine("Вино Riesling", 25, 4, 2, "белое");
		Wine wine2=new Wine("Вино Vina Maipo", 35, 1, 2, "белое");
		Wine wine3=new Wine("Вино Torres San Valentin Garnacha", 32, 3, 3, "красное");
		Cheese cheese1=new Cheese ("Сыр Mascarpone", 5.6, 5, "Republic of Belarus", 0.78);
		Cheese cheese2=new Cheese ("Сыр Сливочный", 3.29, 1, "Republic of Belarus", 0.65);
		Cheese cheese3=new Cheese ("Сыр Классический", 3.12, 5, "Republic of Belarus", 0.60);
		Fruit fruit1= new Fruit ("Фрукт Банан", 4.50, 5, "неспелые", 2.5);
		Fruit fruit2= new Fruit ("Фрукт Яблоко", 3.25, 6, "спелые", 1.5);
		Fruit fruit3= new Fruit ("Фрукт Апельсин", 5.34, 4, "спелые", 1.8);
		Fruit fruit4= new Fruit ("Фрукт Персик", 8.79, 2, "неспелые", 0.6);
		
//		wine1.print();
//		wine1.discount();
//		System.out.println(wine1.getFullPrice());
//		System.out.println(wine1.getCalcFinalPrice());
//		System.out.println(wine1.getAge());				
		
//		System.out.println("Введите ваше имя:");
//			User user= new User ();
//			String nick=sc.next();
//			user.setNickname(nick);				
		
		Product[] productList = new Product[10];	
		
		productList[0]=wine1;
		productList[1]=wine2;
		productList[2]=wine3;
		productList[3]=cheese1;
		productList[4]=cheese2;
		productList[5]=cheese3;
		productList[6]=fruit1;
		productList[7]=fruit2;
		productList[8]=fruit3;
		productList[9]=fruit4;
		
		Product[] cart = new Product[100];	
		int cartIndex=0;
		
		System.out.println("Меню товаров:");
		for (int i=0; i<productList.length; i++)	{
			System.out.println(i+1+": "+productList[i].getName()+"-"+productList[i].getPrice()+" BYN");
			}
		System.out.println("0: Если хотите выйти из меню и завершить выбор товаров");
			
		Scanner sc= new Scanner(System.in);			
		int n=-1;		
		do {
			System.out.println("Введите номер товара из меню:");			
			if(sc.hasNextInt()) {
				n=sc.nextInt();
				
				if(n==0) {
					System.out.println("Корзина с товарами сформирована");	
					break;
				}
				if(n<1 || n>productList.length) {
					System.out.println("Введен не верный номер товара. Повторите ввод номера товара из меню.");
					break;
				}
				  
				System.out.println("Введите необходимое количество данного товара:");
				if (sc.hasNextDouble()) {
					double q=sc.nextDouble();
					cart[cartIndex]=productList[n-1];
					cart[cartIndex].setQuantity(q);
					cartIndex++;
				}
				else {
					System.out.println("Количество товара может быть целым или дробным");
				}
			}
			else {
				System.out.println("Номер товара может быть только целым числом");
			}	 
		}	while (n>=1 && n<=productList.length);   
									
		for (int i=0; i<cartIndex; i++)	{
			System.out.println(i+1+": "+cart[i].getName()+" - "+cart[i].getPrice()+" BYN" + " - "+cart[i].getQuantity()+" ед.");
			}
		
//				  for (int i=0; i<productList.length; i++) {
//				    	i=n-1;
//				    	productList[i].setQuantity(q);
//				    }
			
			
		
		//Deal deal = new Deal();

		
			sc.close();	
	}	 	
}
				
					

//		
//		Product [] 
//		
//		
//		
//		
//		System.out.println("Введите ваше имя:");
//		User user= new User ();
//		user.setNickname()=sc.next();
//		System.out.println();
//		System.out.println("Введите дату вашего рождения согласно шаблону dd/MM/yyyy(dd-MM-yyyy):");
		
		
//		wine1.print();
//		wine1.discount();
//		System.out.println(wine1.getFullPrice());
//		System.out.println(wine1.getProductPrice());
//		
		
				
			
//		RegexDeal t = new RegexDeal("12.01.1698");
//		System.out.println(t.result);
//		
//		RegexDeal t2 = new RegexDeal("12/01/1698");
//		System.out.println(t2.result);
//		
//		RegexDeal t3 = new RegexDeal("12-01-1698");
//		System.out.println(t3.result);		
			
//Product bread= new Product ("Хлеб Нарочанский", 2.35, 2);
//Product milk= new Product ("Молоко Белакт", 3.24, 1);
//Product chocolate= new Product ("Шоколад Аленка", 3.70, 3);
//Product cookie= new Product ("Печенье Слодыч", 1.15, 4);
//Product yogurt= new Product ("Йогурт Активиа", 2.55, 1);
//Product sausage= new Product ("Колбаса Пражская", 7.46, 1);
//			
		
	

