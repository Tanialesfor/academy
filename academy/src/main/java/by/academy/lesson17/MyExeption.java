package by.academy.lesson17;

import java.util.Arrays;

public class MyExeption extends Exception {

	private static final long serialVersionUID = 1L;
	private int detail;
	
	public MyExeption (int detail, String message) {
		super(message);
		this.detail=detail;
	}

	@Override
	public String toString() {
		return "MyExeption [detail=" + detail +getMessage()+ "]";
	}

	

	
	
}
