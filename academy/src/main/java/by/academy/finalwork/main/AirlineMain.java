package by.academy.finalwork.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import by.academy.finalwork.domen.*;
import by.academy.finalwork.service.*;

public class AirlineMain {
	public static void main(String[] args) throws IOException {
		
		ArrayList <Plain> plains = new ArrayList<Plain> ();
		Airline airline = null;
		try ( BufferedReader br = new BufferedReader(new FileReader("src/finalwork/file.txt"))) {
			String str;
			while ((str=br.readLine()) != null) {
				String[] arrayStr =str.split(",");
				switch (arrayStr[1]) {
					case "passenger": {
						PassengerPlain plain = new PassengerPlain();
						plains.add(plain);
						break;
					}
					case "cargo": {
						CargoPlain plain = new CargoPlain();
						plains.add(plain);
						break;
					}
					case "smallEngine": {
						SmallEnginePlain plain = new SmallEnginePlain();
						plains.add(plain);
						break;
					}					
				}
		    }

			
//    		br.readLine();
    					    	   			
		}		
		
		if (plains.isEmpty()==false) { 
			Plain[] plainsarray = new Plain[plains.size()];
			airline = new Airline(plains.toArray(plainsarray));
			//Airline airline = new Airline(plains.toArray(new Plain[0]));
		}	
		
		System.out.println(airline.getCapacityAll());
		
//		Collections.sort();
		
//		SortedSet<Person> set = new TreeSet<>();
//
//		set.add(new Person("Саша", "Иванов", 36));
//		set.add(new Person("Маша", "Петрова", 23));
//		set.add(new Person("Даша", "Сидорова", 34));
//		set.add(new Person("Вася", "Иванов", 25));
//
//		for (Person p : set) {
//			System.out.println(p);
//		}
	}
}