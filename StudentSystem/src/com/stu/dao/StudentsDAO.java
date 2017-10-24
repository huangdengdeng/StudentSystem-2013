package com.stu.dao;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

import java.util.ArrayList;
import java.util.List;

import com.stu.util.DBHelper;
import com.stu.entity.Students;
import com.stu.entity.StudentsCount;

public class StudentsDAO {
	
	/**
	 * ���ѧ����Ϣ
	 * 
	 */
	public int saveStudent(Students students){
		System.out.println(students+"****");
	
		int row =0;
	try{
		 // ���ݿ�����	
	 Connection conn = DBHelper.getConnection();
	 
	String sql = "insert into student(student_no,student_name,student_sex,department,grade,professional,phonenumber,int_time,out_time,building_no,dormitory_no ) values(?,?,?,?,?,?,?,?,?,?,?)";
	// ��ȡPreparedStatement
	PreparedStatement ps = conn.prepareStatement(sql);
	
	

	// ��SQL����еĵ�1��������ֵ
	ps.setString(1, students.getStudent_no());
	// ��SQL����еĵ�2��������ֵ
	ps.setString(2, students.getStudent_name());
	// ��SQL����еĵ�3��������ֵ
	ps.setString(3, students.getStudent_sex());
	// ��SQL����еĵ�4��������ֵ
	ps.setString(4, students.getDepartment());
	// ��SQL����еĵ�5��������ֵ
	ps.setString(5, students.getGrade());
	// ��SQL����еĵ�6��������ֵ
	ps.setString(6, students.getProfessional());
	// ��SQL����еĵ�7��������ֵ
	ps.setString(7, students.getPhonenumber());
	// ��SQL����еĵ�8��������ֵ
	ps.setString(8, students.getInt_time());
	// ��SQL����еĵ�9��������ֵ
	ps.setString(9, students.getOut_time());
	// ��SQL����еĵ�10��������ֵ
	ps.setString(10, students.getBuilding_no());
	// ��SQL����еĵ�11��������ֵ
	ps.setString(11, students.getDormitory_no());
	// ִ�и��²�����������Ӱ�������
	row = ps.executeUpdate();
	
	// �ر�PreparedStatement
				ps.close();
			}
	catch (Exception e) {
				e.printStackTrace();
			}
	
	return row;
	
			
		}
	

	/**
	 * ��ѯ����ѧ����Ϣ
	 * @return List<Students>
	 * @throws Exception 
	 */
	public List<Students> findStudents() {
		Connection conn = null;
		
		// ʵ����List����
		List<Students> list = new ArrayList<Students>();
		try {
			// ���ݿ�����
			 conn = DBHelper.getConnection();
			// ��ȡStatement
				Statement stmt = conn.createStatement();
				// ���ͼ����Ϣ��SQL���
				String sql = "select * from student";
				// ִ�в�ѯ
				ResultSet rs = stmt.executeQuery(sql);
				// �������ƶ������ж��Ƿ���Ч
			// �������ƶ������ж��Ƿ���Ч
			while(rs.next()){
				// ʵ����Book���� id student_no,student_name,student_sex,department,grade,
				//professional,phonenumber,int_time,out_time,building_no,dormitory_no 
				Students students = new Students();
				// 1 ��id���Ը�ֵ
				students.setId(rs.getInt("id"));
				// 2 ��name���Ը�ֵ
				students.setStudent_no(rs.getString("student_no"));
				// 3 ��sex���Ը�ֵ
				students.setStudent_name(rs.getString("student_name"));
				// 4 ��sex���Ը�ֵ
				students.setStudent_sex(rs.getString("student_sex"));
			 	//5 ��age���Ը�ֵ
				students.setDepartment(rs.getString("department"));
				
				
				//6  ��classes���Ը�ֵ
				students.setGrade(rs.getString("grade"));
				// 7  ��name���Ը�ֵ
				students.setProfessional(rs.getString("professional"));
				// 8  ��sex���Ը�ֵ
				students.setPhonenumber(rs.getString("phonenumber"));
				//  9  ��age���Ը�ֵ
				students.setInt_time(rs.getString("int_time"));
				// 10 ��classes���Ը�ֵ
				students.setOut_time(rs.getString("out_time"));
				
				
				// 11 ��age���Ը�ֵ
				students.setBuilding_no(rs.getString("building_no"));
				// 12 ��classes���Ը�ֵ
				students.setDormitory_no(rs.getString("dormitory_no"));
				// ��ͼ�������ӵ�������
				list.add(students);
			}
			rs.close();		// �ر�ResultSet
			stmt.close();	// �ر�Statement
			
		}catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	
	public List<StudentsCount> findStudentsCount() {
		Connection conn = null;
		
		// ʵ����List����
		List<StudentsCount> list = new ArrayList<StudentsCount>();
		try {
			
			// ���ݿ�����	
			 conn = DBHelper.getConnection();
				// ���ͼ����Ϣ��SQL���
				String sql = "select building_no,dormitory_no,count(dormitory_no) as person_count from student  group by building_no,dormitory_no";
				// ִ�в�ѯ
				PreparedStatement ps = conn.prepareStatement(sql);
				// ��SQL����еĵ�1��������ֵ
				//ps.setString(1, sql);
				
				// ��SQL����еĵ�2��������ֵ
				//ps.setString(2, sql);
				//ִ�и��²���
				
				
				ResultSet rs = ps.executeQuery();
				// �������ƶ������ж��Ƿ���Ч
			// �������ƶ������ж��Ƿ���Ч
			while(rs.next()){
				// ʵ����Book���� id student_no,student_name,student_sex,department,grade,
				//professional,phonenumber,int_time,out_time,building_no,dormitory_no 
				StudentsCount studentscount = new StudentsCount();
				
				// 2 ��name���Ը�ֵ
				studentscount.setBuilding_no(rs.getString("building_no"));
				// 3 ��sex���Ը�ֵ
				studentscount.setDormitory_no(rs.getString("dormitory_no"));
				studentscount.setPerson_count(rs.getInt("person_count"));
				// ��ͼ�������ӵ�������
				list.add(studentscount);
			}
			rs.close();		// �ر�ResultSet
			ps.close();	// �ر�Statement
			
		}catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
/*
 * 	
 */
	public List<Students> queryBySno(Students students) throws SQLException {
		//System.out.println("ѧ��+�������ڣ�"+students);
		Connection con = null;
		PreparedStatement pstmt = null;
			try {
				con = DBHelper.getConnection();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String sql = "select * from student where student_no=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, students.getStudent_no());
			
			ResultSet rs = pstmt.executeQuery();
			List<Students> list = new ArrayList<Students>(); 
			while(rs.next()){
				// ʵ����Book���� id student_no,student_name,student_sex,department,grade,
				//professional,phonenumber,int_time,out_time,building_no,dormitory_no 
				Students student = new Students();
				// 1 ��id���Ը�ֵ
				student.setId(rs.getInt("id"));
				// 2 ��name���Ը�ֵ
				student.setStudent_no(rs.getString("student_no"));
				// 3 ��sex���Ը�ֵ
				student.setStudent_name(rs.getString("student_name"));
				// 4 ��sex���Ը�ֵ
				student.setStudent_sex(rs.getString("student_sex"));
			 	//5 ��age���Ը�ֵ
				student.setDepartment(rs.getString("department"));
				
				
				//6  ��classes���Ը�ֵ
				student.setGrade(rs.getString("grade"));
				// 7  ��name���Ը�ֵ
				student.setProfessional(rs.getString("professional"));
				// 8  ��sex���Ը�ֵ
				student.setPhonenumber(rs.getString("phonenumber"));
				//  9  ��age���Ը�ֵ
				student.setInt_time(rs.getString("int_time"));
				// 10 ��classes���Ը�ֵ
				student.setOut_time(rs.getString("out_time"));
				
				
				// 11 ��age���Ը�ֵ
				student.setBuilding_no(rs.getString("building_no"));
				// 12 ��classes���Ը�ֵ
				student.setDormitory_no(rs.getString("dormitory_no"));
				// ��ͼ�������ӵ�������
				list.add(student);
		}
		
		return list;
	}


	
	
	
	
	}

