package com.stu.entity;

public class Laterecord {
//student_no ,student_name,building_no,dormitory_no,date
	private String student_no;
	private String student_name;
	private String building_no;
	private String dormitory_no;
	private String date;
	
	public Laterecord() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Laterecord(String student_no, String student_name,
			String building_no, String dormitory_no, String date) {
		super();
		this.student_no = student_no;
		this.student_name = student_name;
		this.building_no = building_no;
		this.dormitory_no = dormitory_no;
		this.date = date;
	}



	public String getStudent_no() {
		return student_no;
	}
	public void setStudent_no(String student_no) {
		this.student_no = student_no;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getBuilding_no() {
		return building_no;
	}
	public void setBuilding_no(String building_no) {
		this.building_no = building_no;
	}
	public String getDormitory_no() {
		return dormitory_no;
	}
	public void setDormitory_no(String dormitory_no) {
		this.dormitory_no = dormitory_no;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}



	@Override
	public String toString() {
		return "Laterecord [student_no=" + student_no + ", student_name="
				+ student_name + ", building_no=" + building_no
				+ ", dormitory_no=" + dormitory_no + ", date=" + date + "]";
	}
	
	
}
