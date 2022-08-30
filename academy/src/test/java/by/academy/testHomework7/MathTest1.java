package by.academy.testHomework7;

import org.junit.Test;
import junit.framework.Assert;

public class MathTest1 {
	@Test
	public void testSqrtMath() {
		Assert.assertEquals(2, (int)(Math.sqrt(4)));
	}
}
