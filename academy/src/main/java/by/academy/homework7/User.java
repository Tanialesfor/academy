package by.academy.homework7;

import java.util.Objects;

//b)	Добавить класс User, который наследуется от Person, с полями: login, password, email
//c)	Добавить гетеры, сетеры. Добавить метод printUserInfo в User. 

public class User extends Person {
	private String login;
	private String password;
	private String email;
	
	public User() {};
	
	public User (String login,String password,String email, String firstName, String lastName, double age,String dateOfBirth) {
		super(firstName, lastName, age, dateOfBirth);
		this.login=login;
		this.password=password;
		this.email=email;
	}
	
	private void printUserInfo() {
		System.out.println("Информация о пользователе: 1.Логин: "+login+"; 2.Пароль: "+password+"; 3.Email: "+email);
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [login=" + login + ", password=" + password + ", email=" + email + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(email, login, password);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(email, other.email) && Objects.equals(login, other.login)
				&& Objects.equals(password, other.password);
	}
	
	
}
