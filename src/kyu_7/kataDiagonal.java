package kyu_7;

/*
 * Given a square matrix (i.e. an array of subarrays), find the sum of values from the first value
 * of the first array, the second value of the second array, the third value of the third array, and so on...
 * array = [[5, 9, 1, 0],
 *          [8, 7, 2, 3],
 *          [1, 4, 1, 9],
 *          [2, 3, 8, 2]]
 * diagonal sum: 5 + 7 + 1 + 2 = 15
 */

public class kataDiagonal {
	public static int diagonalSum(final int[][] matrix) {
		int sumMatrix = 0;

		for (int i = 0; i < matrix.length; i++) {
			sumMatrix += matrix[i][i];

		}
		return sumMatrix;
	}
}
