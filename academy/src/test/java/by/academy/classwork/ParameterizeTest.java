package by.academy.classwork;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import by.academy.lesson22.Calculator;
import junit.framework.Assert;

@RunWith(value=Parameterized.class)
public class ParameterizeTest extends Assert {
	private int valueA;
	private int valueB;
	private int expected;
	
	public ParameterizeTest (int valueA,int valueB,int expected) {
		this.valueA=valueA;
		this.valueB=valueB;
		this.expected=expected;
	}
	@Parameterized.Parameters(name= "{index}:divide {0} and {1} = {2}")
	public static Iterable <Integer []> dataForTest(){
		return (Iterable <Integer[]>) Arrays.asList(
				new Integer [][] {
					{2,2,1},
					{4,2,2},
					{12,6,2},
					{18,3,6},
					{13,1,13},
					{1,1,1}
					});
	}
	@Test
	public void paramTest() {
		assertEquals(expected,Calculator.divide(valueA, valueB));
	}
}
