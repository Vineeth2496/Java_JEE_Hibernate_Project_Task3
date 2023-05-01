package com.package1;

public class emp {
	private int id;
	private String name;
	private Float sal;
	private String dept;
		
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

	public Float getSal() {
		return sal;
	}

	public void setSal(Float sal) {
		this.sal = sal;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String toString() {
		return "emp [id=" + id + ", name=" + name + ", sal=" + sal + ", dept=" + dept + "]";
	}
	
	

}
