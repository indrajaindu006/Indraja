package com.ibm;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	private int id;
	private String name;
	private String department;
	private Date dateOfJoining;
	private Integer age;
	private Integer salary;

	public Employee() {
		super();
	}

	public Employee(int id, String name, String department, Date dateOfJoining, Integer age, Integer salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.dateOfJoining = dateOfJoining;
		this.age = age;
		this.salary = salary;
	}

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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		System.out.format("%-15s %-30s %-30s %-20s %-10s %-10s\n",id,name,department,new SimpleDateFormat("MM/dd/yyyy").format(dateOfJoining),age,salary);
		return "";
	}

	public int compareTo(Employee e) {
		if (salary == e.salary)
			return 0;
		else if (salary > e.salary)
			return 1;
		else
			return -1;
	}

}
