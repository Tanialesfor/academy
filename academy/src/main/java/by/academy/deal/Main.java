package by.academy.deal;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
				 		
		User user= new User ();
		User user1=new User ();
		User user2=new User ();
		User user3=new User ();
			
		Scanner sc= new Scanner(System.in);	
		
		System.out.println("Реализация задания №3:");
		RegexDeal t = new RegexDeal("12.01.1698");
		System.out.println(t.result);
		
		RegexDeal t2 = new RegexDeal("12/01/1698");
		System.out.println(t2.result);
		
		RegexDeal t3 = new RegexDeal("12-01-1698");
		System.out.println(t3.result);		
		
//		System.out.println("Реализация задания №4:");
//		System.out.println("Введите дату согласно шаблону dd-MM-yyyy(dd/MM/yyyy):");
//		String str=sc.next();
//		DateTimeFormatter formatterDTa=DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.US);
//		DateTimeFormatter formatterDTb=DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.US);
//		LocalDate lda=LocalDate.parse(str, formatterDTa);	
//		LocalDate ldb=LocalDate.parse(str, formatterDTb);
//		System.out.println("День: "+lda.getDayOfMonth());
//		System.out.println("Месяц: "+lda.getMonth());
//		System.out.println("Year: "+lda.getYear());
//		
//		System.out.println("День: "+ldb.getDayOfMonth());
//		System.out.println("Месяц: "+ldb.getMonth());
//		System.out.println("Year: "+ldb.getYear());
		
		
		System.out.println("Реализация заданий №5 и №9:");
		user.setValidPhone("+37623 125-12-56");
		user1.setValidPhone("+37529 579-23-25");
		user2.setValidAmericanPhone("+22356 579-23-25");
		user3.setValidEmail("dfgjrty@ghj.fghytuio");
		
		System.out.println("Реализация задания №8:");
		System.out.println("Введите дату вашего рождения согласно шаблону dd/MM/yyyy(dd-MM-yyyy):");
		String dateOfBirth=sc.next();
		user.setDateOfBirth(dateOfBirth);
		
	
		System.out.println("Основная реализация:");	
		
		System.out.println("Введите ваше имя (покупатель):");
		String nb=sc.next();
		user1.setNickname(nb);
		System.out.println("Введите ваше имя (продавец):");
		String ns=sc.next();
		user2.setNickname(ns);
		
		
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
			
		int n=-1;	
		boolean skip=false;
		do {
			skip=false;
			System.out.println("Введите номер товара из меню:");			
			if(sc.hasNextInt()) {
				n=sc.nextInt();
				
				if(n==0) {
					System.out.println("Корзина с товарами сформирована");	
					break;
				}
				if(n<1 || n>productList.length) {
					System.out.println("Введен не верный номер товара. Повторите ввод номера товара из меню.");
					skip=true;
					continue;
				}
				
				for (int i=0;i<cart.length;i++) {
					if (cart[i]==productList[n-1] && cart.length>0) {
						skip=true;
						System.out.println("Данный товар уже добавлен в корзину");
						break;
					}
				}
				
				if (skip==true) {
					continue;
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
		}	while (n>=1 && n<=productList.length || skip==true);   
									
		for (int i=0; i<cartIndex; i++)	{
			System.out.println(i+1+": "+cart[i].getName()+" - "+cart[i].getPrice()+" BYN" + " - "+cart[i].getQuantity()+" ед.");
			}
				  
			
		
		//Deal deal = new Deal();

		
			sc.close();	
	}	 	
}
			
				

		
		
//		wine1.print();
//		wine1.discount();
//		System.out.println(wine1.getFullPrice());
//		System.out.println(wine1.getProductPrice());
//		
		
				
			

			
	
	

