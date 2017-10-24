package com.stu.entity;

public class Employee {
	private int id; // id,building_no,employee_no,employee_name,employee_ps
	private String building_no; //  学号 
	private String employee_no; // 姓名 
	private String employee_name; //性别
	private String employee_ps; // 学生院系 
	public Employee() {
	
	
	}
	public Employee(String building_no, String employee_no,
			String employee_name, String employee_ps) {
		super();
		this.building_no = building_no;
		this.employee_no = employee_no;
		this.employee_name = employee_name;
		this.employee_ps = employee_ps;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBuilding_no() {
		return building_no;
	}
	public void setBuilding_no(String building_no) {
		this.building_no = building_no;
	}
	public String getEmployee_no() {
		return employee_no;
	}
	public void setEmployee_no(String employee_no) {
		this.employee_no = employee_no;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public String getEmployee_ps() {
		return employee_ps;
	}
	public void setEmployee_ps(String employee_ps) {
		this.employee_ps = employee_ps;
	}
	
}
