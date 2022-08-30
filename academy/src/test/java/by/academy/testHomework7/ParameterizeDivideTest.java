package by.academy.testHomework7;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import junit.framework.Assert;

import by.academy.homework7.Calculator;

@RunWith(value=Parameterized.class)
public class ParameterizeDivideTest extends Assert {
	private int valueA;
	private int valueB;
	private int expected;
	
	public ParameterizeDivideTest (int valueA,int valueB,int expected) {
		this.valueA=valueA;
		this.valueB=valueB;
		this.expected=expected;
	}
	
//	@Parameterized.Parameters(name= "{index}:sum {0} and {1} = {2}")
//	public static Iterable <Double []> dataForTestSum(){
//		return (Iterable <Double[]>) Arrays.asList(
//				new Double [][] {
//					{2.0,2.0,4.0},
//					{2.0,1.5,3.5},
//					{12.0,6.0,18.0},
//					{7.5,3.5,11.0}
//					});
//	}
//	
//	@Parameterized.Parameters(name= "{index}:substract {0} and {1} = {2}")
//	public static Iterable <Double []> dataForTestSubstract(){
//		return (Iterable <Double[]>) Arrays.asList(
//				new Double [][] {
//					{4.0,3.0,1.0},
//					{4.0,2.0,2.0},
//					{12.0,8.0,4.0},
//					{8.0,0.5,7.5}
//					});
//	}
	
	@Parameterized.Parameters(name= "{index}:divide {0} and {1} = {2}")
	public static Iterable <Integer []> dataForTestDivide(){
		return (Iterable <Integer[]>) Arrays.asList(
				new Integer [][] {
					{2,2,1},
					{4,2,2},
					{12,6,2},
					{8,4,2},
					{13,13,1},
					{1,1,1}
					});
	}
	
//	@Test
//	public void paramSumTest() {
//		assertEquals(expected,Calculator.sum(valueA, valueB));
//	}
//	@Test
//	public void paramSubstractTest() {
//		assertEquals(expected,Calculator.substract(valueA, valueB));
//	}
		@Test
	public void paramDivideTest() {
		assertEquals(expected,Calculator.divide(valueA, valueB));
	}
	
}
