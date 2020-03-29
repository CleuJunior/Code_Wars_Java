package kyu_7;

/*
 * Given an integral number, determine if it's a square number
 */

public class kataSqr {
	public static boolean isSquare(int n) {
		int raizQuad = (int) Math.sqrt(n);
		int pow = (int) Math.pow(raizQuad, 2);

		if (pow == n) return true;
		
		return false;
	}

}
