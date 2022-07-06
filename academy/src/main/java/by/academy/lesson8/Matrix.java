package by.academy.lesson8;

import java.util.Arrays;

public class Matrix {
	
	int n;
	int m;
	double[][] matr;
	
	public int getQuantityRows() {
		return n;	
	}	
	
	public int getQuantityColumns() {
		return m;	 
	}
	
	public double[][] getMatrix() {
		return matr;	 
	}	
    
	public Matrix (int n, int m) {
	   this.n=n;
	   this.m=m;
	   this.matr = new double[n][m];
    }
	
	public void setRandom() {
		for (int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				this.matr[i][j]=Math.random()*100;
			}
		}
	}
	public void print() {
//		System.out.println(Arrays.deepToString(this.matr));

		for (int i=0;i<n;i++) {
			System.out.println(Arrays.toString(this.matr[i]));
		}
	}
// второй способ распечатки двумерного массива
//		for (int i=0;i<n;i++) {
//			System.out.print("[");
//			for (int j=0;j<m;j++) {
//				System.out.print(this.matr[i][j] + "  ");
//			}
//			System.out.println("]");
//		}
//	}
	
	public void multiplication (double number) {
		for (int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				this.matr[i][j]=this.matr[i][j]*number;
			}
		}
	}
	
	public void multiplication (double[][] addmatr) {
		for (int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				this.matr[i][j]=this.matr[i][j]*addmatr[i][j]; 
			}
		}
	}
	
	public void addition (double[][] addmatr) {
		for (int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				this.matr[i][j]=this.matr[i][j]+addmatr[i][j];
			}
		}
	}
	public Matrix () {
		super();
	}	
}
