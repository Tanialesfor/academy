package by.academy.finalwork.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

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
	
	public double getCarryingAll () {
		for (int i=0; i<plains.size();i++) {
			this.carryingAll+=plains.get(i).getCarrying();
		}	
		return carryingAll;
	}
	
	public void sortPlain() {
		Collections.sort(plains);
		System.out.println("Результат сортировки по дальности полета самолетов: "+ "\n"+plains.toString());
	}
	public ArrayList <Plain> findAllPlain(Double from, Double to) {
		ArrayList <Plain> plainsAll=new ArrayList <Plain>();
		for (int i=0;i<plains.size();i++) {
			if (plains.get(i).getFuelUse()>=from && plains.get(i).getFuelUse()<=to) {				
				plainsAll.add(plains.get(i));
			}
		}
		return plainsAll;
	}	
	
	@Override
	public String toString() {
		return "Airline [plains=" + plains + "]";
	}
		
	@Override
	public int hashCode() {
		return Objects.hash(capacityAll, carryingAll, plains);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airline other = (Airline) obj;
		return capacityAll == other.capacityAll
				&& Double.doubleToLongBits(carryingAll) == Double.doubleToLongBits(other.carryingAll)
				&& Objects.equals(plains, other.plains);
	}
}
