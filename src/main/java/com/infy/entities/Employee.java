package com.infy.entities;

public class Employee {
	private int id;
	private String name;
	private String jobrole;
	private String location;
	private int salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getJobrole() {
		return jobrole;
	}

	public void setJobrole(String jobrole) {
		this.jobrole = jobrole;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
