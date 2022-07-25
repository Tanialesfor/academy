package by.academy.lesson13;

import java.io.Serializable;
import by.academy.lesson10.Animal;
import by.academy.lesson10.Cat;

//6.	а) Создать обобщенный класс с тремя параметрами (T, V, K). Класс содержит три переменные типа (T, V, K),
//конструктор, принимающий на вход параметры типа (T, V, K), методы возвращающие значения трех переменных. 
//Создать метод, выводящий на консоль имена классов для трех переменных класса.
//б) Наложить ограничения на параметры типа: T должен реализовать интерфейс Comparable 
//(классы-оболочки, String), V должен реализовать интерфейс Serializable и расширять класс Animal, 
//K должен расширять класс Number.

public class Threeneric <T extends Comparable<String>, V extends Animal & Serializable, K extends Number> {
	private T tVariable;
	private V vVariable;
	private K kVariable;
	
	public Threeneric(T tVariable, V vVariable, K kVariable) {
		super();
		this.tVariable=tVariable;
		this.vVariable=vVariable;
		this.kVariable=kVariable;
	}
	public void printTVariable() {
		System.out.println(tVariable.getClass());
	}
	public void printVVariable() {
		System.out.println(vVariable.getClass());
	}
	public void printKVariable() {
		System.out.println(kVariable.getClass());
	}
	
	public T gettVariable() {
		return tVariable;
	}
	public void settVariable(T tVariable) {
		this.tVariable = tVariable;
	}
	
	public V getvVariable() {
		return vVariable;
	}
	public void setvVariable(V vVariable) {
		this.vVariable = vVariable;
	}
	
	public K getkVariable() {
		return kVariable;
	}
	public void setkVariable(K kVariable) {
		this.kVariable = kVariable;
	}

	public String getKName() {
		if (kVariable == null) {
			return null;
		}
		return kVariable.getClass().getName();
	}

	public String getTName() {
		if (tVariable == null) {
			return null;
		}
		return tVariable.getClass().getName();
	}

	public static String getName(Object o) {
		if (o == null) {
			return null;
		}
		return o.getClass().getName();
	}

	public String getVName() {
		if (vVariable == null) {
			return null;
		}
		return vVariable.getClass().getName();
	}
}
