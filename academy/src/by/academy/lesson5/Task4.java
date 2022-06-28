package by.academy.lesson5;

public class Task4 {
	public static void main(String[] args) {
		String str1="string";
		String str2="code";
		String str3="Practice";
		int a=str1.length();
		int b=str2.length();
		int c=str3.length();
		System.out.println(str1.substring((a-1)/2, (a-1)/2+2));
		System.out.println(str2.substring((b-1)/2, (b-1)/2+2));
		System.out.println(str3.substring((c-1)/2, (c-1)/2+2));
	}

}
