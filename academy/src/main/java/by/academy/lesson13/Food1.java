package by.academy.lesson13;

//5. Создать интерфейс Cookable, содержащий метод void cook(String str). Создать класс Food, 
//содержащий метод public void prepare(Cookable c, String str) { c.cook(str);} Создать экземпляр 
//класса Food и вызвать его метод prepare(). На вход метода prepare() передать экземпляр анонимного 
//класса, расширяющего интерфейс Cookable.

public class Food1 implements Cookable {

	@Override
	public void cook(String str) {
		System.out.println(str);
	}
	
	public void prepare(Cookable c, String str) { 
		c.cook(str);}
	
	Food1 food=new Food1();

}
