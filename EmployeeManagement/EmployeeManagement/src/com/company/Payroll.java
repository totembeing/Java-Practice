package com.company;

/*Not a sub-class of Employee but a utility class that performs operations on Employee objects.
 * It takes Employee objects as an input and perform operation on it like generating a payroll.*/
public class Payroll {

	public double bonus;
	
	public void generatePayroll(Employee e) {
		e.displayDetails();
		bonus = e.calculateBonus();
		System.out.print("Bonus: $" + bonus);
	}
	
}
