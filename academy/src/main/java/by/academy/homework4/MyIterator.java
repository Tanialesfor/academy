package by.academy.homework4;

import java.util.Iterator;

public class MyIterator {
		
	public static void main(String[] args) {
							
		String [] array ={"A", "B", "C", "D" };
        
        Iterator <String> iterator = new Iterator <String>()
        {

            private int i = 0;
            
            @Override
            public boolean hasNext() {
                return array.length > i;
            }
 
            @Override
            public String next() {
                return String.valueOf(array[i+1]);
            }
            
        };
 
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hashCode());
    }
	
}
