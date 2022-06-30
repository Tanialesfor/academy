package by.academy.lesson6;

import java.util.Arrays;

//Найти слово, в котором число различных символов минимально.  
//Слово может содержать буквы и цифры.  
//Если таких слов несколько, найти первое из них.  
//Например в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff". 

public class Task11 {
	public static void main(String[] args) { 
		String str="fffff ab f 1234 jkjk";
		String[] array = str.split(" ");
		System.out.println(Arrays.toString(array));
		int minUniqueChars=0;
		int minUniqueCharsIndex=0;
		
			for (int i=0;i<array.length; i++) {		
				if (array[i].length()>minUniqueChars) {
					minUniqueChars=array[i].length();
				}
			}
	    
	    	for (int i=0;i<array.length;i++) {
	    		
	    		StringBuilder stb = new StringBuilder(array[i]);
	    		
	    		for (int j=0;j<stb.length();j++) {
	    			for(int k=j+1;k<stb.length();k++) {
	    				if (stb.charAt(j)==stb.charAt(k)) {
	    					stb.deleteCharAt(k);
	    					k--;
	    				}
	    			}	    			
	    		}
	    		
		    	if (stb.length()<minUniqueChars) {
		    		minUniqueChars=stb.length();
		    		minUniqueCharsIndex = i;
		    	}	    		
	    	}	

	    	System.out.println(array[minUniqueCharsIndex]);	    					    
	    		
	     }
	     	
	    	 
	}

