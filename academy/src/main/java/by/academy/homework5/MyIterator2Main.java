package by.academy.homework5;

public class MyIterator2Main {
	public static void main(String[] args) {
		Integer [][] array=new Integer [][] {{1,2,3}, {4,8}, {5,6,7,8,9}, {12,15,10,19}};
		MyIterator2 <Integer> arrayIterator= new MyIterator2<>(array);
		
		while (arrayIterator.hasNext()==true) {
        	System.out.println(arrayIterator.next());
        }
				
	}
}
