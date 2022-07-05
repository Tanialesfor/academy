package by.academy.deal;

public class User {
		
	String name;
	double money;
	
	public User () {
		
	}
	public User (String name) {
		this.name=name;
	}	

	public void setMoney (double money) {
		this.money=money;
	}
	public double getMoney () {
		return money;
	}
	
}
