package by.academy.lesson16;

import java.util.Arrays;

import java.util.ArrayList;

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
		
		arrayList.set(0, new HeavyBox(1,2,3,1));
		
		arrayList.get(0).setWeight(1);
		System.out.println("После изменения веса в первом ящике:"+arrayList);
		
		arrayList.remove(5);
		System.out.println("После удаления последнего ящика:"+arrayList);
		
		
		// 1 вариант
				Object[] objectArray = arrayList.toArray();
				System.out.println(Arrays.toString(objectArray));

//				// 2 вариант
				HeavyBox[] stringArray1 = new HeavyBox[arrayList.size()];
				arrayList.toArray(stringArray1);
				System.out.println(Arrays.toString(stringArray1));

//				// 3 вариант
				HeavyBox[] stringArray2 = arrayList.toArray(new HeavyBox[0]);
				System.out.println(Arrays.toString(stringArray2));
		 }
}
