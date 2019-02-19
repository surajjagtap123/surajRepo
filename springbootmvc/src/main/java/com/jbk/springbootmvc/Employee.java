package com.jbk.springbootmvc;

public class Employee {
	int age;
	String loc;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int age, String loc) {
		super();
		this.age = age;
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Employee [age=" + age + ", loc=" + loc + "]";
	}
}
