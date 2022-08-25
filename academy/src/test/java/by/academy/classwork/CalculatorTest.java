package by.academy.classwork;

import org.junit.Ignore;
import org.junit.Test;

import by.academy.lesson22.Calculator;
import junit.framework.Assert;

//добавить методы sum, substract, divide, multiple в Culculator
// добавить тесты для каждого метода

public class CalculatorTest {
	
	private Calculator calc;
		@Test
		public void testSum() {
			Assert.assertEquals(4.0, Calculator.sum(2, 2));
		}
		@Test
		public void testSubstract() {
			Assert.assertEquals(3.0, Calculator.substract(5, 2));
		}
		@Test
		public void testDivide() {
			Assert.assertEquals(3, Calculator.divide(6, 2));
		}
		@Test
		public void testMultiple() {
			Assert.assertEquals(10.0, Calculator.multiple(5, 2));
		}
		@Test (timeout=100)
		public void testTimeout() {
			int i=0;
			while (i<999) {
				System.out.println("alalala");
				i++;
			}
		}
		@Test 
		@Ignore
		public void testFail() {
			Assert.fail("Ахахахах");
		}
		
	}
		

