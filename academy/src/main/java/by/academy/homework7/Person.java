package by.academy.homework7;

import java.util.Objects;

//a)	Создать свой класс Person с полями: firstName, lastName, age, dateOfBirth 
public class Person {
	protected String firstName;
	private String lastName;
	public double age;
	protected String dateOfBirth;
		
	public Person () {};
	
	public Person (String firstName, String lastName, double age, String dateOfBirth) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
		this.dateOfBirth=dateOfBirth;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, dateOfBirth, firstName, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Double.doubleToLongBits(age) == Double.doubleToLongBits(other.age)
				&& Objects.equals(dateOfBirth, other.dateOfBirth) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName);
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", dateOfBirth="
				+ dateOfBirth + "]";
	}
}
