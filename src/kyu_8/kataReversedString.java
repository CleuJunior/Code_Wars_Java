package kyu_8;

/*
 * Complete the solution so that it reverses the string value passed into it.
 *  Kata.solution("world") //returns "dlrow"
 */

public class kataReversedString {
	public static String solution(String str) {
		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);

		}
		return reversed;
	}

}
