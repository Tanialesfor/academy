package by.academy.deal;

public class User {
		
	private String name;
	private double money;
	
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
