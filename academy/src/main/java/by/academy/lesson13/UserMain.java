package by.academy.lesson13;
//В методе main(): создать экземпляр класса User и вызвать метод createQuery(); 
//создать экземпляр класса Query и вызвать метод printToLog() используя конструкцию user.new Query(); 
//создать экземпляр клас

public class UserMain {
	public static void main(String[] args) {
		User user=new User("fdkjhgkj", "123456");
	
		user.createQuery();
	User.Query query= user.new Query(); 
	query.printToLog();
	
	
	
	}
	
	
}
