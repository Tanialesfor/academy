package by.academy.homework4;

//Задание 2.
//1. Создать класс Body.
//2. Создать внутренний класс Heart, объект которого создается в конструкторе Body.
//Реализовать метод live (в классе Heart), в котором вы в цикле пробегаетесь от нуля до Integer.MAX_VALUE 
//и на каждую 100 итерацию выводите на экран "Knock-knock-knockin' on heaven's door".
//3. Создать внутренний класс Lungs, объект которого создается в конструкторе Body.
//Реализовать метод live (в классе Lungs), в котором вы в цикле пробегаетесь от нуля до Integer.MAX_VALUE 
//и на каждую 50 итерацию выводите на экран "breathe in", а на каждую 100 - "breathe out".
//4. Реализовать метод live в классе Body, в котором мы запускаем метод live на объекте lungs (lungs.live()) 
//и метод live на объекте heart (heart.live()).
//После отработки обоих методов выведем на экран:
//"You stand on the shore and feel the salty smell of the wind that blows from the sea. 
//And I believe that you are free, and life has only begun.".

public class Body {
	
	public Heart heart;
	public Lungs lungs;

	public class Heart {

		public void live() {
			for(int i=0; i<=Integer.MAX_VALUE; i++) {
				if ((i+1)%1000000000==0 ) {
					System.out.println("Knock-knock-knockin' on heaven's door.");
					System.out.println(i+1);
				}
			}
		}
	}
	
	public class Lungs {

		public void live() {
			for(int i=0; i<=Integer.MAX_VALUE; i++) {
				if ((i+1)%500000000==0 ) {
					System.out.println("Breathe in");
					System.out.println(i+1);	
					System.out.println(Integer.MAX_VALUE);
				}
				if ((i+1)%1000000000==0 ) {
					System.out.println("Breathe out");
					System.out.println(i+1);						
				}							
			}
		}
	}
	
	public Body () {
		super ();
		this.heart = new Heart();
		this.lungs = new Lungs();
	}
	public void live(){
//		Body.Lungs lungs=this.new Lungs();
//		Body.Heart heart=this.new Heart();
//		Lungs lungs=new Body().new Lungs();
//		Heart heart=new Body().new Heart();		
		this.heart.live();
		this.lungs.live();		
	}
}

