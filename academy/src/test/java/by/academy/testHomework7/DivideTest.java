package by.academy.testHomework7;

import org.junit.Test;

import by.academy.homework7.Calculator;
import junit.framework.Assert;

public class DivideTest {
	
	@Test
	public void testDivide() {
		Assert.assertEquals(3, Calculator.divide(6, 2));
	}
}
