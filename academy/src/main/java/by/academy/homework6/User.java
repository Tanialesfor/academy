package by.academy.homework6;

import java.io.Serializable;
import java.util.Objects;

//Создайте класс User с полями Имя, Фамилия, Возраст и конструктором(Имя, Фамилия, Возраст). 
//В классе Main создайте ArrayList<User>, добавьте 10 пользователей в коллекцию. Создайте каталог(папку)
//users и для каждого пользователя создайте файл в этом каталоге. Назовите файл Имя_Фамилия.txt. 
//Сериализуйте информацию о пользователе и положите в файл пользователя. Не забываем закрывать потоки. 
//В блоке catch выводим сообщение ошибки на экран (System.err.println(e.getMessage());)

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private String surname;
	private double age;
	
	public User (String name, String surname, double age ) {
		super();
		this.name=name;
		this.surname=surname;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name, surname);
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
		return Double.doubleToLongBits(age) == Double.doubleToLongBits(other.age) && Objects.equals(name, other.name)
				&& Objects.equals(surname, other.surname);
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", surname=" + surname + ", age=" + age + "]";
	}
	
}
