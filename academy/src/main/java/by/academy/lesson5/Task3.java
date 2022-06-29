package by.academy.lesson5;

public class Task3 {
	public static void main(String[] args) {	
		
		StringBuilder ab1= new StringBuilder("Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.");
		String str1=ab1.toString();
		str1=str1.toLowerCase();
		int x=0;
		int index=-1;
		do {
			index=str1.indexOf("object-oriented programming",index==-1 ? 0 : index+1);
			if (index!=-1) x++;
			if (x%2==0) {
				ab1.replace(index, index+"object-oriented programming".length(), "OOP");
				str1=ab1.toString();
				str1=str1.toLowerCase();
			}
		} while (index!=-1);
		
		System.out.println(ab1);
	}
}
