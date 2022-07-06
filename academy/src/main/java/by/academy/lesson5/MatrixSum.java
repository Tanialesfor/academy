package by.academy.lesson5;

import java.util.Scanner;

public class MatrixSum {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Введите n: ");
	        int n = sc.nextInt();
	        System.out.print("Введите m: ");
	        int m = sc.nextInt();
	        int [][] a = new  int [n][m];
	        System.out.println("Введите элеменнты 1 массива, по порядку: ");
	        for (int i = 0; i < a.length; i++) {
	            for (int j = 0; j < a[i].length; j++) {
	                a [i][j] = sc.nextInt();
	            }
	        }
	        int [][] b = new  int [n][m];
	        System.out.println("Введите элеменнты 2 массива, по порядку: ");
	        for (int i = 0; i < b.length; i++) {
	            for (int j = 0; j < b[i].length; j++) {
	                b [i][j] = sc.nextInt();
	            }
	        }
	        System.out.println("Матрица 1: ");
	        for (int i = 0; i < a.length; i++) {
	            for (int j = 0; j < a[i].length; j++) {
	                System.out.print(a[i][j] + " ");
	            }
	            System.out.println();
	        }
	        System.out.println("Матрица 2: ");
	        for (int i = 0; i < b.length; i++) {
	            for (int j = 0; j < b[i].length; j++) {
	                System.out.print(b[i][j] + " ");
	            }
	            System.out.println();
	        }
	 
	        System.out.println("Сумма матриц: ");
	        int[][]c = new int[n][m];
	        
	        for (int i = 0; i < c.length; i++) {
	 
	            for (int j = 0; j < c[i].length; j++) {
	 
	                c[i][j] = a[i][j] + b[i][j];
	                System.out.print(c[i][j]+" ");
	 	         }
	 
	            System.out.println();
	        }
	    sc.close();
	 }
	}

