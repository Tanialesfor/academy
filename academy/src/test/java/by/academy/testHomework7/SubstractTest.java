package by.academy.testHomework7;

import org.junit.Test;

import by.academy.homework7.Calculator;
import junit.framework.Assert;


public class SubstractTest {
	
	@Test
	public void testSubstract() {
		Assert.assertEquals(2.0, Calculator.substract(5, 3));
	}
}
