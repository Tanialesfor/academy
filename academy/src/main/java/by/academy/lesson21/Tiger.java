package by.academy.lesson21;

public class Tiger extends Cat{
	public String nickname;
	protected double weight;
	private int codenickname;
	
		
	public String getNickname() {
		return nickname;
	}
	protected void slep () {
		System.out.println("Тигр бежит");
	}

	private void run() {
		System.out.println("Тигр бежит");
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


	public int getCodenickname() {
		return codenickname;
	}


	public void setCodenickname(int codenickname) {
		this.codenickname = codenickname;
	}
	
}
