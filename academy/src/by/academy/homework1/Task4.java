package by.academy.homework1;

public class Task4 {
	public static void main (String[] args) {
		double x=0;
		int i=0;
		while (x<=1000000) {
			x=Math.pow(2,i);
			System.out.println("2^"+i+" = "+(int)x);
			i++;
		}		
	}
}
