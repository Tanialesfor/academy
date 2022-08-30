package by.academy.lesson23;

public class MyRunnable implements Runnable{

	public MyRunnable() {}
	
	@Override
	public void run() {
		for (int i=0; i<=10; i++) {
		System.out.println(i);
		}
		System.out.println(Thread.currentThread().getName()+"завершил свою работу");
	}

}
