package by.academy.lesson8;

public class Test {
	public static void main(String[] args) {

			
		Phone p1=new Phone ("+(37529)256-356-23","Sumsung",1.00);
		Phone p2=new Phone ("+(37544)564-25-68","Apple", 1.50);
		Phone p3=new Phone ("+(37533)369-84-12","Nokio",1.75);

			System.out.println(p1.getNumber()+"/"+p1.getModel()+"/"+p1.getWeight());
			System.out.println(p2.getNumber()+"/"+p2.getModel()+"/"+p2.getWeight());
			System.out.println(p3.getNumber()+"/"+p3.getModel()+"/"+p3.getWeight());
			
			p1.receiveCall("Виктория");
			p2.receiveCall("Владимир");
			p3.receiveCall("Владислава");
			
			System.out.println(p1.getNumber());
			System.out.println(p2.getNumber());
			System.out.println(p3.getNumber());
			
			p1.receiveCall("Виктория", p1.getNumber());
			p2.receiveCall("Владимир",p2.getNumber());
			p3.receiveCall("Владислава",p3.getNumber());
			
			System.out.println(p1.toString());
			System.out.println(p2.toString());
			System.out.println(p3.toString());			
			
			System.out.println(p1.equals(p2));
			
			if (true) {System.out.println("TRUE");}
			if (false) {System.out.println("TRUE");} else {System.out.println("FALSE");}
	}
}
