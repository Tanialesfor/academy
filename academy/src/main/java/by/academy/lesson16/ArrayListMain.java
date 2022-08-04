package by.academy.lesson16;

import java.util.Arrays;

import java.util.ArrayList;

//1.а) Создать динамический массив, содержащий объекты класса HeavyBox. 
//б) Распечатать его содержимое используя for each. 
//в) Изменить вес первого ящика на 1. 
//г) Удалить последний ящик. 
//д) Получить массив содержащий ящики из коллекции тремя способами и вывести на консоль. 
//е) Удалить все ящики.
//2.	Получить массив содержащий объекты класса HeavyBox из коллекции тремя способами и вывести на консоль.


public class ArrayListMain  {
	public static void main(String[] args) {
	
		ArrayList <HeavyBox> arrayList =new ArrayList <HeavyBox>();
		
		arrayList.add(new HeavyBox(1,2,3,2));
		arrayList.add (new HeavyBox(2,2,4,1));
		arrayList.add (new HeavyBox(1,5,4,2));
		arrayList.add( new HeavyBox(2,1,3,1));
		arrayList.add( new HeavyBox(3,2,5,6));
		arrayList.add( new HeavyBox(5,2,7,8));
		
		for(HeavyBox hb:arrayList) {
			System.out.println(hb);
		}
		
//		arrayList.set(0, new HeavyBox(1,2,3,1));
		
		arrayList.get(0).setWeight(1);
		System.out.println("После изменения веса в первом ящике:"+arrayList);
		
		arrayList.remove(5);
		System.out.println("Массив после удаления последнего ящика:"+arrayList);
				
		        Object[] objectArray = arrayList.toArray();
				System.out.println("Массив содержащий объекты класса HeavyBox из коллекции, вариант1: "+Arrays.toString(objectArray));

				HeavyBox[] stringArray1 = new HeavyBox[arrayList.size()];
				arrayList.toArray(stringArray1);
				System.out.println("Массив содержащий объекты класса HeavyBox из коллекции, вариант2: "+Arrays.toString(stringArray1));

				HeavyBox[] stringArray2 = arrayList.toArray(new HeavyBox[0]);
				System.out.println("Массив содержащий объекты класса HeavyBox из коллекции, вариант3: "+Arrays.toString(stringArray2));
				
			arrayList.clear();	
			System.out.println("Массив после удаления:"+arrayList);
		 }
	
}
