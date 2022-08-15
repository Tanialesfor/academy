package by.academy.homework5;

//Можно писать все в main. Не нужно создавать новых классов.
//Имеется текст. Следует составить для него частотный словарь:
//Создать Map<Character, Integer> для символов, в который мы заносим 
//символ и его количество.
import java.util.HashMap;
import java.util.Map;

public class Task5 {
	public static void main(String[] args) {
		
		String str="Java — строго типизированный объектно-ориентированный язык "
				+ "программирования общего назначения, разработанный компанией Sun "
				+ "Microsystems. Разработка ведётся сообществом, организованным "
				+ "через Java Community Process; язык и основные реализующие "
				+ "его технологии распространяются по лицензии GPL.";
		String lowerstr=str.toLowerCase();
		Map<Character, Integer> map=new HashMap<>();
			for(int i=0;i<lowerstr.length();i++){
			Character uniqueChars=lowerstr.charAt(i);
			Integer countofuniqueChars=map.get(uniqueChars);
				if(countofuniqueChars==null){
					countofuniqueChars=1;
					map.put(uniqueChars, countofuniqueChars);
				}
				else{
					countofuniqueChars+=1;
					map.put(uniqueChars, countofuniqueChars);
				}			
		     }
			System.out.println("Частотный словарь: "+map.toString());
	}

}
