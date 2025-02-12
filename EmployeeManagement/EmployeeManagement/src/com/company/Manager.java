package com.company;

//A sub-class of abstract Employee class
//Concept of Inheritance, using the extends keyword
public class Manager extends Employee{

	//A constructor for the Manager sub-class
	public Manager(String name, String id, double salary) {
		//The constructor calls the constructor of parent class using super() to instantiate an object
		super(name, id, salary);
	}

	//Abstract method getting overridden depending on the kind of sub-class
	@Override
	public double calculateBonus() {
		return (this.getSalary() * 20) / 100;
	}
	
}
