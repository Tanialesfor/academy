package by.academy.lesson8;

//import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
		Phone p1=new Phone ("1", "Sumsung",1.00);
		Phone p2=new Phone ("2","Apple", 1.50);
		Phone p3=new Phone ("3","Nokio",1.75);

			System.out.println(p1.getNumber());
			System.out.println(p2.getModel());
			System.out.println(p3.getWeight());
//	sc.close();
	}
}
