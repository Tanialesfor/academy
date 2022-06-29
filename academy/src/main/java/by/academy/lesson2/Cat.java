package by.academy.lesson2;

public class Cat {
	int age;
	String nickname;
	double money;
	char initials;
	boolean isHomeAnimal;
	
	public void grow() {
		age = age + 1;
	}

	public void sleep() {
		System.out.println("Кот спит");
	}

	public void eat() {
		System.out.println("Кот ест");
	}

	public void walk() {
		System.out.println("Кот гуляет");
	}

	public Cat() {
	}

	public Cat(String nickname) {
		this.nickname = nickname;
		this.initials=nickname.charAt(0);
	}
	
	public void setMoney(double money) {
 		this.money=money;
 	}
	
 	public double getMoney() {
 		return money;
 	}
 	public void setInitials() {
 		this.initials=nickname.charAt(0);
 	}
//--второй способ реализации 	
// 	public void setInitials2(String nick) {
// 		this.initials=nick.charAt(0);
// 	}
	
 	public char getInitials() {
 		return initials;
 	}
 	
// 	public void setNickname(String nickname) {
// 		this.nickname=nickname;
// 	}
 	public void setIsHomeAnimal(boolean isHomeAnimal) {
 		this.isHomeAnimal=isHomeAnimal;
 	}
	
 	public boolean getIsHomeAnimal() {
 		return isHomeAnimal;
 	} 	
}
