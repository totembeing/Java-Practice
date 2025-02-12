package com.company;

public class HR extends Employee{

	public HR(String name, String id, double salary) {
		super(name, id, salary);
	}
	
	@Override
	public double calculateBonus() {
		return (this.getSalary() * 12) / 100;
	}
}
