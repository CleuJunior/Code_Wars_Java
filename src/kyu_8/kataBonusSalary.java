package kyu_8;

/*
 * It's bonus time in the big city! The fatcats are rubbing their paws in anticipation... but who is going to make the most money?

 * Build a function that takes in two arguments (salary, bonus). Salary will be an integer, and bonus a boolean.

 * If bonus is true, the salary should be multiplied by 10. If bonus is false, the fatcat did not make enough money
 * and must receive only his stated salary.
 */

public class kataBonusSalary {
	public static String bonusTime(final int salary, final boolean bonus) {
		int newSalary = salary;
		if(bonus == true) newSalary *= 10;
		
		return "\u00A3" + newSalary;
	}

}
