package by.academy.lesson4;

public class Task_c01 {
	void printFirstFiveElements(int count) {
		for (int i=1; i<=count; i++) {
			System.out.println(i);
			if (i==5) return;
			//if (i==5) continue;
			//if (i==5) break;
		}
		System.out.println("Test!");
	}
}
