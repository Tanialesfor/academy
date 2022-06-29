package by.academy.lesson2;

public class Application {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Cat cat2 = new Cat("Пушок");

		cat2.eat();
		cat2.sleep();
		cat2.walk();
		
		cat1.grow();
		cat1.grow();
		cat1.grow();
		
		System.out.println(cat1.age);

//------тестовые
//		if(cat1.getIsHomeAnimal()==true) {} else {}
//		cat1.setNickname("Nick");
//		cat1.setInitials();
//		System.out.println(cat1.getInitials());
//		cat1.setNickname("Alex");
//		cat1.setInitials2(cat1.nickname);
//		System.out.println(cat1.getInitials());
	}
}
