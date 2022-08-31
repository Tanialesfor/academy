package by.academy.testHomework7;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;


public class RunnerTest extends BlockJUnit4ClassRunner{
	private CalculatorTestListener calculatorTestListener;
	
	public RunnerTest(Class<CalculatorTestListener> clz) throws InitializationError {
		super(clz);
		calculatorTestListener= new CalculatorTestListener();
	}
	@Override
	public void run(final RunNotifier notifier) {
		notifier.addListener(calculatorTestListener);
		super.run(notifier);
	}
}
