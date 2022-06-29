package by.academy.lesson5;

public class SetCharAtDemo {
	public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        System.out.println("charAt(1) = " + sb.charAt(1));
        sb.setCharAt(1, 'i');
        sb.setLength(2);
        System.out.println(sb);
    
//        StringBuilder s = new StringBuilder("abcdef");
//
//        System.out.println(s);
//        s.reverse();
//        System.out.println(s);
	
	
//        StringBuilder stringBuilder = new StringBuilder("Hello");
//
//        System.out.println("string = " + stringBuilder);
//        System.out.println("length = " + stringBuilder.length());
//        System.out.println("capacity = " + stringBuilder.capacity()); 
//        capacity возвращает размер буфера
	
	
	}
}
