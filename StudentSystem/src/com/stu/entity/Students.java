package com.stu.entity;

public class Students {//ѧ��������Ϣ������ ѧ�� �Ա�  ѧ��Ժϵ  �꼶  רҵ  �绰����  ��סʱ��  �뿪ʱ�䣨����¥�� ���᷿�� ��
	private int id; // ��� studet_no  studet_name  studet_sex  department  grade  professional number  int_time  out_time  building_no  dormitory_no 
	
	private String student_no; //  ѧ�� 
	private String student_name; // ���� 
	private String student_sex; //�Ա�
	private String department; // ѧ��Ժϵ 
	private String grade; // �꼶 
	private String professional; //רҵ
	private String phonenumber; // �绰����   
	private String int_time; //��סʱ��
	private String out_time; // �뿪ʱ��
	private String building_no; //����¥��
	private String dormitory_no; //���᷿��
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