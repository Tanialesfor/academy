package by.academy.lesson21;

public class Tiger extends Cat{
	public String nickname;
	protected double weight;
	private int codenicknick;
	
	
	public String getNickname() {
		return nickname;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public int getCodenicknick() {
		return codenicknick;
	}


	public void setCodenicknick(int codenicknick) {
		this.codenicknick = codenicknick;
	}


	protected void run() {
		System.out.println("Тигр бежит");
	}
}
