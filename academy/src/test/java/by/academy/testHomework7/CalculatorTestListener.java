package by.academy.testHomework7;

import org.junit.runner.Description;
import org.junit.runner.notification.RunListener;

//добавить CalculatorTestListener, переопределить, метод который вызывается на успешное завершение 
//теста и выводит на экран название нашего метода.

public class CalculatorTestListener extends RunListener {
	
	@Override
	public void testFinished(Description description) throws java.lang.Exception {
		System.out.println("Execution Finished : " + description.getMethodName());
	}
}
