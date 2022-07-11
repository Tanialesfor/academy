package by.academy.deal;

public class User {
		
	private String name;
	private double money;
	private String phone;
	private String email;
	private String dateOfBirth;
	
	public User () {
		super();
	}	
	public void setName (String name) {
		this.money=money;
	}
	public String getName () {
		return name;
	}
	public void setMoney (double money) {
		this.money=money;
	}
	public double getMoney () {
		return money;
	}
	public void setPhone (String phone) {
		this.phone=phone;
	}
	public String getPhone () {
		return phone;
	}
	public void setEmail (String email) {
		this.email=email;
	}
	public String getEmail () {
		return email;
	}
	public String toString() {
		StringBuilder stbU = new StringBuilder();
		stbU.append("Пользователь: [имя=");
		stbU.append(name);
		stbU.append(", деньги=");
		stbU.append(money);
		stbU.append(", номер телефона=");
		stbU.append(phone);
		stbU.append(", электронная почта=");
		stbU.append(email);
		stbU.append("]");
		return stbU.toString();
	}
}

