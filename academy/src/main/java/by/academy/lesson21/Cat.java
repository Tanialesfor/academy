package by.academy.lesson21;

public class Cat {
	public String name;
	protected int age;
	private int codename;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCodename() {
		return codename;
	}
	public void setCodename(int codename) {
		this.codename = codename;
	}
	protected void eat() {
		System.out.println("Кот кушает");
	}

}
