package com.company;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//Creating an Array List of all the employee objects
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Manager("Alice", "101", 70000));
		employees.add(new Developer("Bob", "102", 60000));
		employees.add(new HR("Charlie", "103", 50000));
		
		/*To perform the functions in the Payroll class, we need to create a Payroll object first.*/
		Payroll payroll = new Payroll();
		
		//Iterating through each employee object in the Array List to perform functions on it.
		for(Employee employee: employees) {
			payroll.generatePayroll(employee);
			System.out.println("");
		}
		
	}

	
}
