package by.academy.lesson5;

public class Task2 {
	public static void main(String[] args) {
	
    int a=3;
    int b=56;
    StringBuilder ab1 = new StringBuilder();
    String str1=ab1.append(a).append("+").append(b).append("=").append(a+b).toString();
    System.out.println(str1);
    StringBuilder ab2 = new StringBuilder();
    String str2=ab2.append(a).append("-").append(b).append("=").append(a-b).toString();
    System.out.println(str2);	
    StringBuilder ab3 = new StringBuilder();
    String str3=ab3.append(a).append("*").append(b).append("=").append(a*b).toString();
    System.out.println(str3);		
   
    ab1.insert(ab1.indexOf("="),"равно");
    ab1.deleteCharAt(ab1.indexOf("="));
    System.out.println(ab1);
    ab2.insert(ab2.indexOf("="),"равно");
    ab2.deleteCharAt(ab2.indexOf("="));
    System.out.println(ab2);
    ab3.insert(ab3.indexOf("="),"равно");
    ab3.deleteCharAt(ab3.indexOf("="));
    System.out.println(ab3);
	
    StringBuilder ab11= new StringBuilder(str1);
	System.out.println(ab11.replace(ab11.indexOf("="), ab11.indexOf("="), "равно"));
	StringBuilder ab12= new StringBuilder(str2);
	System.out.println(ab12.replace(ab12.indexOf("="), ab12.indexOf("="), "равно"));
	StringBuilder ab13= new StringBuilder(str3);
	System.out.println(ab13.replace(ab13.indexOf("="), ab13.indexOf("="), "равно"));
	}
}
