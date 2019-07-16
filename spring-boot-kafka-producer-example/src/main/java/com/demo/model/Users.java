package com.demo.model;

public class Users {

	private String name;
	private String dept;
	
	
	public Users() {
		super();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public Users(String name, String dept) {
		super();
		this.name = name;
		this.dept = dept;
	}
	
	
}
