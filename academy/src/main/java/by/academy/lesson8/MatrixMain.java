package by.academy.lesson8;

import java.util.Arrays;

public class MatrixMain {
	public static void main(String[] args) {
		
		Matrix matr1=new Matrix(3,4);
		matr1.setRandom();
		System.out.println("Матрица №1:");
		matr1.print();
		
		Matrix matr2=new Matrix(3,4);
		matr2.setRandom();
		System.out.println("Матрица №2:");
		matr2.print();
				
		matr1.multiplication(2);
		System.out.println("Умножение Матрицы №1 на число:");
		matr1.print();
		
		matr1.addition(matr2.getMatrix());
		System.out.println("Сложение Матрицы №1 с Матрицей №2:");
		matr1.print();
		
		matr1.multiplication(matr2.getMatrix());
		System.out.println("Умножение Матрицы №1 на Матрицу №2:");
		matr1.print();
	}
}
