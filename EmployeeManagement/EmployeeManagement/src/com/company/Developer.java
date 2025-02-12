package com.company;

public class Developer extends Employee{

	public Developer(String name, String id, double salary) {
		super(name, id, salary);
	}
	
	@Override
	public double calculateBonus() {
		return (this.getSalary() * 15) / 100;
	}
}
