package com.stu.entity;

public class Students {//学生基本信息：姓名 学号 性别  学生院系  年级  专业  电话号码  入住时间  离开时间（宿舍楼号 宿舍房号 ）
	private int id; // 序号 studet_no  studet_name  studet_sex  department  grade  professional number  int_time  out_time  building_no  dormitory_no 
	
	private String student_no; //  学号 
	private String student_name; // 姓名 
	private String student_sex; //性别
	private String department; // 学生院系 
	private String grade; // 年级 
	private String professional; //专业
	private String phonenumber; // 电话号码   
	private String int_time; //入住时间
	private String out_time; // 离开时间
	private String building_no; //宿舍楼号
	private String dormitory_no; //宿舍房号
public  Students(){
		
	}
public  Students(String student_no,String student_name,String student_sex,String department,String grade,String professional,String phonenumber,String int_time,String out_time,String building_no,String dormitory_no){
    	
    	this.student_no = student_no;
    	this.student_name = student_name;
    	this.student_sex = student_sex;
    	this.department = department;
    	this.grade = grade;
    	this.professional = professional;
    	this.phonenumber = phonenumber;
    	this.int_time = int_time;
    	this.out_time = out_time;
    	this.building_no = building_no;
    	this.dormitory_no = dormitory_no;
	}
    
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getStudent_sex() {
		return student_sex;
	}
	public void setStudent_sex(String student_sex) {
		this.student_sex = student_sex;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getProfessional() {
		return professional;
	}
	public void setProfessional(String professional) {
		this.professional = professional;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getInt_time() {
		return int_time;
	}
	public void setInt_time(String int_time) {
		this.int_time = int_time;
	}
	public String getOut_time() {
		return out_time;
	}
	public void setOut_time(String out_time) {
		this.out_time = out_time;
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
	
	
}