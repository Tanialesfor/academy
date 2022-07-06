package by.academy.lesson8;
//1. Класс Phone. 
//a) Создайте класс Phone, который содержит переменные number, model и weight. 
//б) Создайте три экземпляра этого класса.  
//в) Выведите на консоль значения их переменных.  
//г) Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”. getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов. 
//д) Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.  
//е) Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.  
//ж) Добавить конструктор без параметров. 
//з) Вызвать из конструктора с тремя параметрами конструктор с двумя.  
//и) Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод. 
//к) Создать метод sendMessageс аргументами переменнойx длины(varargs). Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов. 
//л) Изменить класс Phone в соответствии с концепцией JavaBean.
public class Phone {
	String number;
	String model;
	double weight;
	String nickname;
	
	public void setNumber (String number) {
		this.number=number;
	}
	public String getNumber() {
		return number;
	}
	public void setModel (String model) {
		this.model=model;
	}
	public String getModel() {
		return model;
	}	
	public void setWeight (double weight) {
		this.weight=weight;
	}
	public double getWeight() {
		return weight;
	}	
	
	public Phone (String number, String model, double weight) {
		this.number=number;
		this.model=model;
		this.weight=weight;
		}

	public String receiveCall (String nickname) {
		return nickname;
	}
		
	public Phone () {
		super();
	}
	
}
