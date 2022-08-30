package by.academy.testHomework7;

import org.junit.Test;

import by.academy.homework7.Calculator;
import junit.framework.Assert;

public class SumTest {

	@Test
	public void testSum() {
		Assert.assertEquals(6.0, Calculator.sum(3, 3));
	}
}
