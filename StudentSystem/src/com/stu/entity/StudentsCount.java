package com.stu.entity;

public class StudentsCount {
	private String building_no; //Àﬁ…·¬•∫≈
	private String dormitory_no; //Àﬁ…·∑ø∫≈
	private int person_count;//
	
	public StudentsCount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentsCount(String building_no, String dormitory_no,
			int person_count) {
		super();
		this.building_no = building_no;
		this.dormitory_no = dormitory_no;
		this.person_count = person_count;
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

	public int getPerson_count() {
		return person_count;
	}

	public void setPerson_count(int person_count) {
		this.person_count = person_count;
	}
	
	
}
