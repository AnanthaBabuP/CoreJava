package com.CodingChalangeArray;

import java.util.Scanner;								

public class MatrixMultiplication {								
								
    public static void main(String[] args) {								
        Scanner scanner = new Scanner(System.in);								
								
        // Input for the first matrix								
        System.out.println("Enter dimensions for Matrix A (rows and columns): ");								
        int rowsA = scanner.nextInt();								
        int colsA = scanner.nextInt();								
        								
        int[][] matrixA = new int[rowsA][colsA];								
        System.out.println("Enter elements of Matrix A:");								
        for (int i = 0; i < rowsA; i++) {								
            for (int j = 0; j < colsA; j++) {								
                matrixA[i][j] = scanner.nextInt();								
            }								
        }								
								
        // Input for the second matrix								
        System.out.println("Enter dimensions for Matrix B (rows and columns): ");								
        int rowsB = scanner.nextInt();								
        int colsB = scanner.nextInt();								
        								
        if (colsA != rowsB) {								
            System.out.println("Error: Number of columns in Matrix A must be equal to number of rows in Matrix B.");								
            return;								
        }								
        								
        int[][] matrixB = new int[rowsB][colsB];								
        System.out.println("Enter elements of Matrix B:");								
        for (int i = 0; i < rowsB; i++) {								
            for (int j = 0; j < colsB; j++) {								
                matrixB[i][j] = scanner.nextInt();								
            }								
        }								
								
        // Perform matrix multiplication								
        int[][] result = multiplyMatrices(matrixA, matrixB);								
								
        // Print the result								
        System.out.println("Result of matrix multiplication:");								
        printMatrix(result);								
								
        // Close the scanner								
        scanner.close();								
    }								
								
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {								
        int m = A.length;      // Number of rows in A								
        int n = A[0].length;   // Number of columns in A (rows in B)								
        int p = B[0].length;   // Number of columns in B								
								
        // Initialize the result matrix								
        int[][] result = new int[m][p];								
        								
        // Perform the matrix multiplication								
        for (int i = 0; i < m; i++) {								
            for (int j = 0; j < p; j++) {								
                result[i][j] = 0;								
                for (int k = 0; k < n; k++) {								
                    result[i][j] += A[i][k] * B[k][j];								
                }								
            }								
        }								
        								
        return result;								
    }								
								
    public static void printMatrix(int[][] matrix) {								
        for (int[] row : matrix) {								
            for (int value : row) {								
                System.out.print(value + " ");								
            }								
            System.out.println();								
        }								
    }								
}								

