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
	 * 添加学生信息
	 * 
	 */
	public int saveStudent(Students students){
		System.out.println(students+"****");
	
		int row =0;
	try{
		 // 数据库连接	
	 Connection conn = DBHelper.getConnection();
	 
	String sql = "insert into student(student_no,student_name,student_sex,department,grade,professional,phonenumber,int_time,out_time,building_no,dormitory_no ) values(?,?,?,?,?,?,?,?,?,?,?)";
	// 获取PreparedStatement
	PreparedStatement ps = conn.prepareStatement(sql);
	
	

	// 对SQL语句中的第1个参数赋值
	ps.setString(1, students.getStudent_no());
	// 对SQL语句中的第2个参数赋值
	ps.setString(2, students.getStudent_name());
	// 对SQL语句中的第3个参数赋值
	ps.setString(3, students.getStudent_sex());
	// 对SQL语句中的第4个参数赋值
	ps.setString(4, students.getDepartment());
	// 对SQL语句中的第5个参数赋值
	ps.setString(5, students.getGrade());
	// 对SQL语句中的第6个参数赋值
	ps.setString(6, students.getProfessional());
	// 对SQL语句中的第7个参数赋值
	ps.setString(7, students.getPhonenumber());
	// 对SQL语句中的第8个参数赋值
	ps.setString(8, students.getInt_time());
	// 对SQL语句中的第9个参数赋值
	ps.setString(9, students.getOut_time());
	// 对SQL语句中的第10个参数赋值
	ps.setString(10, students.getBuilding_no());
	// 对SQL语句中的第11个参数赋值
	ps.setString(11, students.getDormitory_no());
	// 执行更新操作，返回所影响的行数
	row = ps.executeUpdate();
	
	// 关闭PreparedStatement
				ps.close();
			}
	catch (Exception e) {
				e.printStackTrace();
			}
	
	return row;
	
			
		}
	

	/**
	 * 查询所有学生信息
	 * @return List<Students>
	 * @throws Exception 
	 */
	public List<Students> findStudents() {
		Connection conn = null;
		
		// 实例化List对象
		List<Students> list = new ArrayList<Students>();
		try {
			// 数据库连接
			 conn = DBHelper.getConnection();
			// 获取Statement
				Statement stmt = conn.createStatement();
				// 添加图书信息的SQL语句
				String sql = "select * from student";
				// 执行查询
				ResultSet rs = stmt.executeQuery(sql);
				// 光标向后移动，并判断是否有效
			// 光标向后移动，并判断是否有效
			while(rs.next()){
				// 实例化Book对象 id student_no,student_name,student_sex,department,grade,
				//professional,phonenumber,int_time,out_time,building_no,dormitory_no 
				Students students = new Students();
				// 1 对id属性赋值
				students.setId(rs.getInt("id"));
				// 2 对name属性赋值
				students.setStudent_no(rs.getString("student_no"));
				// 3 对sex属性赋值
				students.setStudent_name(rs.getString("student_name"));
				// 4 对sex属性赋值
				students.setStudent_sex(rs.getString("student_sex"));
			 	//5 对age属性赋值
				students.setDepartment(rs.getString("department"));
				
				
				//6  对classes属性赋值
				students.setGrade(rs.getString("grade"));
				// 7  对name属性赋值
				students.setProfessional(rs.getString("professional"));
				// 8  对sex属性赋值
				students.setPhonenumber(rs.getString("phonenumber"));
				//  9  对age属性赋值
				students.setInt_time(rs.getString("int_time"));
				// 10 对classes属性赋值
				students.setOut_time(rs.getString("out_time"));
				
				
				// 11 对age属性赋值
				students.setBuilding_no(rs.getString("building_no"));
				// 12 对classes属性赋值
				students.setDormitory_no(rs.getString("dormitory_no"));
				// 将图书对象添加到集合中
				list.add(students);
			}
			rs.close();		// 关闭ResultSet
			stmt.close();	// 关闭Statement
			
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
		
		// 实例化List对象
		List<StudentsCount> list = new ArrayList<StudentsCount>();
		try {
			
			// 数据库连接	
			 conn = DBHelper.getConnection();
				// 添加图书信息的SQL语句
				String sql = "select building_no,dormitory_no,count(dormitory_no) as person_count from student  group by building_no,dormitory_no";
				// 执行查询
				PreparedStatement ps = conn.prepareStatement(sql);
				// 对SQL语句中的第1个参数赋值
				//ps.setString(1, sql);
				
				// 对SQL语句中的第2个参数赋值
				//ps.setString(2, sql);
				//执行更新操作
				
				
				ResultSet rs = ps.executeQuery();
				// 光标向后移动，并判断是否有效
			// 光标向后移动，并判断是否有效
			while(rs.next()){
				// 实例化Book对象 id student_no,student_name,student_sex,department,grade,
				//professional,phonenumber,int_time,out_time,building_no,dormitory_no 
				StudentsCount studentscount = new StudentsCount();
				
				// 2 对name属性赋值
				studentscount.setBuilding_no(rs.getString("building_no"));
				// 3 对sex属性赋值
				studentscount.setDormitory_no(rs.getString("dormitory_no"));
				studentscount.setPerson_count(rs.getInt("person_count"));
				// 将图书对象添加到集合中
				list.add(studentscount);
			}
			rs.close();		// 关闭ResultSet
			ps.close();	// 关闭Statement
			
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
		//System.out.println("学号+考勤日期："+students);
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
				// 实例化Book对象 id student_no,student_name,student_sex,department,grade,
				//professional,phonenumber,int_time,out_time,building_no,dormitory_no 
				Students student = new Students();
				// 1 对id属性赋值
				student.setId(rs.getInt("id"));
				// 2 对name属性赋值
				student.setStudent_no(rs.getString("student_no"));
				// 3 对sex属性赋值
				student.setStudent_name(rs.getString("student_name"));
				// 4 对sex属性赋值
				student.setStudent_sex(rs.getString("student_sex"));
			 	//5 对age属性赋值
				student.setDepartment(rs.getString("department"));
				
				
				//6  对classes属性赋值
				student.setGrade(rs.getString("grade"));
				// 7  对name属性赋值
				student.setProfessional(rs.getString("professional"));
				// 8  对sex属性赋值
				student.setPhonenumber(rs.getString("phonenumber"));
				//  9  对age属性赋值
				student.setInt_time(rs.getString("int_time"));
				// 10 对classes属性赋值
				student.setOut_time(rs.getString("out_time"));
				
				
				// 11 对age属性赋值
				student.setBuilding_no(rs.getString("building_no"));
				// 12 对classes属性赋值
				student.setDormitory_no(rs.getString("dormitory_no"));
				// 将图书对象添加到集合中
				list.add(student);
		}
		
		return list;
	}


	
	
	
	
	}

