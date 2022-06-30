package by.academy.homework2;

//import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int minUniqueChars=0;
		int minUniqueCharsIndex=0;
		System.out.println("Введите число n (количество слов): ");
		if (sc.hasNextInt()) {
			int n=sc.nextInt();
			String [] array=new String [n];
			System.out.println("Введите cлова: ");
			
			for (int i=0;i<array.length; i++) {		
				array[i]=sc.next();	
				if (array[i].length()>minUniqueChars) {
					minUniqueChars=array[i].length();
				}
			}
		
//			System.out.println(Arrays.toString(array));
				
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
		else {
			System.out.println("Необходимо ввести символ типа int");
		}
				    
		    	
//		for (int i=0;i<=n-1; i++ ) {
//			System.out.println(array[i]);
//		}			
		
		
		sc.close();
	}
}
