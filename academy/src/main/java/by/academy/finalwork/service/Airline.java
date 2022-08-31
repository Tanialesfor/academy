package by.academy.finalwork.service;

import java.util.ArrayList;
import java.util.Collections;
import by.academy.finalwork.domen.Plain;

//Авиакомпания. Определить иерархию самолетов. Создать авиакомпанию.
//Посчитать общую вместимость и грузоподъемность. Провести сортировку самолетов
//компании по дальности полета. Найти самолет в компании, соответствующий заданному
//диапазону параметров потребления горючего.
public class Airline {
	
	private ArrayList <Plain> plains;
	private int capacityAll=0;
	private double carryingAll=0;
	
	public Airline () {
		super();
	}
	
	public Airline (ArrayList <Plain> plains) {
		this.plains=plains;
	}
	
	public int getCapacityAll () {
		for (int i=0; i<plains.size();i++) {
			this.capacityAll+=plains.get(i).getCapacity();
		}	
		return capacityAll;
	}
	
	public double getcarryingAll () {
		for (int i=0; i<plains.size();i++) {
			this.carryingAll+=plains.get(i).getCarrying();
		}	
		return carryingAll;
	}
	
	public void sortPlain() {
		Collections.sort(this.plains);
		System.out.println(this.toString());
	}
	
	public Plain findPlain(Double from, Double to) {
		for (int i=0;i<this.plains.size();i++) {
			if (this.plains.get(i).getFlightRange()>=from && this.plains.get(i).getFlightRange()<=to) {
				return this.plains.get(i);
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "Airline [plains=" + plains + "]";
	}
}
