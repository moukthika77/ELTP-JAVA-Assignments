package com.psl.learning.Matrix;

public class MatrixAdd {
			static void printMatrix(int M[][], 
		            int rowSize, 
		            int colSize) 
		{ 
		for (int i = 0; i < rowSize; i++) { 
		for (int j = 0; j < colSize; j++) 
		System.out.print(M[i][j] + " "); 
		
		System.out.println(); 
		} 
		}
		static int[][] add(int A[][], int B[][], 
		       int size) 
		{ 
		int i, j; 
		int C[][] = new int[size][size]; 
		
		for (i = 0; i < size; i++) 
		for (j = 0; j < size; j++) 
		C[i][j] = A[i][j] + B[i][j]; 
		
		return C; 
		} 
		public static void main(String[] args) 
		{ 
		int size = 4; 
		int A[][] = { { 1,2 ,3, 4 }, 
				{ 1,2 ,3, 4 },  
				{ 1,2 ,3, 4 }, 
				{ 1,2 ,3, 4 } }; 
		
		int B[][] = { { 1,2 ,3, 4 }, 
				{ 1,2 ,3, 4 },  
				{ 1,2 ,3, 4 }, 
				{ 1,2 ,3, 4 } }; 
		int C[][] = add(A, B, size); 
		System.out.println("\nResultant Matrix:"); 
		printMatrix(C, size, size); 
	} 
}