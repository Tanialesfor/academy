package by.academy.finalwork.service;

import by.academy.finalwork.domen.Plain;
import by.academy.lesson15.comparator.Person;

//Авиакомпания. Определить иерархию самолетов. Создать авиакомпанию.
//Посчитать общую вместимость и грузоподъемность. Провести сортировку самолетов
//компании по дальности полета. Найти самолет в компании, соответствующий заданному
//диапазону параметров потребления горючего. 

public class Airline extends Plain implements Comparable <Airline>{
	
	private Plain[] plains;
	private int capacityAll=0;
	private double carryingAll=0;
	
	public Airline () {
		super();
	}
	
	public Airline (Plain[] plains) {
		this.plains=plains;
	}
	
	public int getCapacityAll () {
		for (int i=0; i<plains.length;i++) {
			this.capacityAll+=plains[i].getCapacity();
		}	
		return capacityAll;
	}
	
	public double getcarryingAll () {
		for (int i=0; i<plains.length;i++) {
			this.carryingAll+=plains[i].getCarrying();
		}	
		return carryingAll;
	}

	@Override
	public int compareTo(Airline plain) {
		return (int) (this.flightRange-plain.flightRange);
	}

	
}
