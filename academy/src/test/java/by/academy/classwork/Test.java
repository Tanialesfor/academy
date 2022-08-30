package by.academy.classwork;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(TestRunner.class)
public class Test {
	public static class SubTestWithRunner extends ParameterizeTest {

		public SubTestWithRunner(int valueA, int valueB, int expected) {
			super(valueA, valueB, expected);
		}

		@BeforeClass
		public static void init() {
			System.out.println("SubTestWithRunner init()");
		}
	}
}
