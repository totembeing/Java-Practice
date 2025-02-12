package com.company;

//An abstract class that gives a layout for sub-classes 
public abstract class Employee {

	//Instance variables of the class
	public String name;
	protected String id;
	private double salary;
	
	//Constructor to initialize objects of sub-classes of Employee class
	public Employee(String name, String id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	//Get method for salary
	public double getSalary() {
		return salary;
	}
	
	//Abstract method to calculate bonus 
	/*An abstract method needs to be implemented by the sub-class, otherwise the complier gives an 
	 * error during the runtime.*/
	public abstract double calculateBonus();
	
	//Print employee details
	public void displayDetails() {
		System.out.printf("Employee Name: %s | Employee Id: %s | Employee Salary: $%s | ", name, id, salary);
	}
	
	
	
	
}
