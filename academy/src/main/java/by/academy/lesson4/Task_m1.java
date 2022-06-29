package by.academy.lesson4;

public class Task_m1 {
	public static void main(String[] args) {
		int a=0;
		for (int i=2; i<=20; i++) {
			if (i%2==0) {
				a++;}
		}
		int [] array=new int[a];
		for (int i=2, b=0; i<=20; i++) {
			if (i%2==0) {
				array[b]=i;
				System.out.print(array[b]+" ");
				b++;		
			}			
		}
//		int [] array=new int[10];
//		for (int i=0; i<10; i++) {
//			array[i]=2*(i+1);
//			System.out.print(array[i]+" ");
//		}
		System.out.println(" ");
		System.out.println("New array:");
		for (int i=0; i<array.length; i++)   {
			System.out.println(array[i]);
		}
//		for (int element:array) {        
//			System.out.println(element);   
//		}
	}
}
