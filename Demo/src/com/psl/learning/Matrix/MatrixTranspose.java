package com.psl.learning.Matrix;

public class MatrixTranspose {
    static void transpose(int A[][], int B[][]) 
    { 
        int i, j; 
        for (i = 0; i < 4; i++) 
            for (j = 0; j < 4; j++) 
                B[i][j] = A[j][i]; 
    }
    public static void main (String[] args) 
    { 
        int A[][] = { {1, 1, 1, 1}, 
                      {2, 2, 2, 2}, 
                      {3, 3, 3, 3}, 
                      {4, 4, 4, 4}}; 
        int B[][] = new int[4][4], i, j; 
        transpose(A, B); 
        for (i = 0; i < 4; i++) 
        { 
            for (j = 0; j < 4; j++) 
            System.out.print(B[i][j] + " "); 
            System.out.print("\n"); 
        } 
    } 

}