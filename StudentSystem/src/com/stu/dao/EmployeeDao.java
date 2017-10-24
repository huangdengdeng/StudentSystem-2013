package com.stu.dao;

import java.sql.Connection;
import java.sql.ResultSet;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;


import com.stu.entity.Employee;

import com.stu.util.DBHelper;

public class EmployeeDao {
	
	/**
	 * 添加管理员
	 * 
	 */
	public int saveEmployee(Employee employee){
		System.out.println(employee+"****");
	
		int row =0;
	try{
		 // 数据库连接	
	 Connection conn = DBHelper.getConnection();
	// building_no  employee_no  employee_name  employee_ps 	 
	String sql = "insert into employee(building_no,employee_no,employee_name,employee_ps) values(?,?,?,?)";
	// 获取PreparedStatement
	PreparedStatement ps = conn.prepareStatement(sql);
	// 对SQL语句中的第1个参数赋值
	ps.setString(1, employee.getBuilding_no());
	// 对SQL语句中的第2个参数赋值
	ps.setString(2, employee.getEmployee_no());
	// 对SQL语句中的第3个参数赋值
	ps.setString(3, employee.getEmployee_name());
	// 对SQL语句中的第4个参数赋值
	ps.setString(4, employee.getEmployee_ps());
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
	 * 查询管理员信息
	 * @return List<Employee>
	 * @throws Exception 
	 */
	public List<Employee> findEmployee() {
		Connection conn = null;
		
		// 实例化List对象
		List<Employee> list = new ArrayList<Employee>();
		try {
			// 数据库连接
			 conn = DBHelper.getConnection();
			// 获取Statement
				Statement stmt = conn.createStatement();
				// 添加图书信息的SQL语句
				String sql = "select building_no,employee_no,employee_name,employee_ps from employee";
				// 执行查询
				ResultSet rs = stmt.executeQuery(sql);
				// 光标向后移动，并判断是否有效
			// 光标向后移动，并判断是否有效
			while(rs.next()){

				Employee employee = new Employee();
				//building_no,employee_no,employee_name,employee_ps
				// 对所有属性赋值
				employee.setBuilding_no(rs.getString("building_no"));
				employee.setEmployee_no(rs.getString("employee_no"));
				employee.setEmployee_name(rs.getString("employee_name"));
				employee.setEmployee_ps(rs.getString("employee_ps"));
				// 将管理员对象添加到集合中
				list.add(employee);
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
	
	
	
	
	
	
	public boolean isLogin(String employee_no, String employee_ps) throws Exception{
		boolean isT=false;
		Connection conn = DBHelper.getConnection();
		Statement stmt = conn.createStatement();// 3、Statement 接口需要通过Connection 接口进行实例化操作
		//"select * from user where username = '" + username
		//+ "' and password = '" + password + "'"
	    ResultSet rs = stmt.executeQuery("select employee_no,employee_ps from employee where employee_no = '" + employee_no+ "' and employee_ps = '" + employee_ps + "'"); // 执行SQL 语句，查询数据库
		while (rs.next()) {
			isT = true;
	 	}
		rs.close();
		// 4、关闭数据库
		return isT;
	}
	
	
	public String findByEmployeeNo(String employee_no) throws SQLException {
		   Connection con=null;
		   ResultSet rs =null;
		   PreparedStatement pstmt =null;
		   try{
		    con=DBHelper.getConnection();;
			String sql = "SELECT * FROM  employee WHERE employee_no=?";
		    pstmt = con.prepareStatement(sql);
			pstmt.setString(1, employee_no);
			rs = pstmt.executeQuery();
			if(rs == null) {
				return null;
			}
			if(rs.next()) {
				Employee employee = new Employee();
				employee.setEmployee_no(rs.getString("employee_no"));
				employee.setEmployee_ps(rs.getString("employee_ps"));
			return employee_no;
			} else {
				return null;
			}
		} catch(Exception e) {
			throw new RuntimeException(e);
		} 
		}
	
	
	
	
	public List<Employee> queryByeID(Employee employee) throws SQLException {
		//System.out.println("学号+考勤日期："+students);
		Connection con = null;
		PreparedStatement pstmt = null;
			try {
				con = DBHelper.getConnection();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String sql = "select * from employee where employee_no=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, employee.getEmployee_no());
			
			ResultSet rs = pstmt.executeQuery();
			List<Employee> list = new ArrayList<Employee>(); 
			while(rs.next()){
				// 实例化Book对象 id student_no,student_name,student_sex,department,grade,
				Employee employee1 = new Employee();
				//building_no,employee_no,employee_name,employee_ps
				// 对所有属性赋值
				employee1.setBuilding_no(rs.getString("building_no"));
				employee1.setEmployee_no(rs.getString("employee_no"));
				employee1.setEmployee_name(rs.getString("employee_name"));
				employee1.setEmployee_ps(rs.getString("employee_ps"));
				// 将管理员对象添加到集合中
				list.add(employee1);
			
		}
		
		return list;
	}

}
