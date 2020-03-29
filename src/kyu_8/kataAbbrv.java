package kyu_8;

/*
 * Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
 * The output should be two capital letters with a dot separating them.

 * It should look like this:

 * Sam Harris => S.H
 * Patrick Feeney => P.F
 */

public class kataAbbrv {
	public static String abbrevName(String name) {
		String newName = name.charAt(0) + ".";
		for (int i = 0; i < name.length() - 1; i++) {
			if (name.charAt(i) == ' ')
				newName += name.charAt(i + 1);

		}
		return newName.toUpperCase();
	}

}
