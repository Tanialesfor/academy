package by.academy.deal;

import java.util.Objects;

public class User extends BelarusPhoneValidator{
		
	private String nickname;
	private double money;
	protected String phone;
	protected String email;
	private String dateOfBirth;
	
	public User () {
		super();
	}	
	public void setNickname (String nickname) {
		this.nickname=nickname;
	}
	public String getNickname () {
		return nickname;
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
	public void setValidPhone(String phone) {
		if (isValid(phone)) {
			this.phone=phone;
		} else {
			System.out.println("Некорректный телефон: "+phone);
		}
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
	
	
	@Override
	public int hashCode() {
		return Objects.hash(money, nickname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Double.doubleToLongBits(money) == Double.doubleToLongBits(other.money)
				&& Objects.equals(nickname, other.nickname);
	}
	
	public String toString() {
		StringBuilder stbU = new StringBuilder();
		stbU.append("Пользователь: [имя=");
		stbU.append(nickname);
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

