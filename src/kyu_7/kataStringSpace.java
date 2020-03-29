package kyu_7;

/*
 * Modify the spacify function so that it returns the given string with spaces inserted between each character.
 * spacify("hello world") // returns "h e l l o   w o r l d"
 */

public class kataStringSpace {
	public static String spacify(String str) {
		return str.replace("", " ").trim();
	}

}
