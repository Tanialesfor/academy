package by.academy.lesson23;

public class MyRunnableMain {
	public static void main(String[] args)  {
		
		MyRunnable myRunnable=new MyRunnable();
		Thread thread1=new Thread(myRunnable);
		thread1.setDaemon(true);
		Thread thread2=new Thread(myRunnable);
		Thread thread3=new Thread(myRunnable);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
		
}
