package com.stu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stu.util.DBHelper;

public class UpdateEmpServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public UpdateEmpServlet() {
		super();
	}

	private static final long serialVersionUID = 1L; 
	/**
	 * Constructor of the object.
	 */
	

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		try {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//获取参数

		String building_no=request.getParameter("building_no");
		String employee_no=request.getParameter("employee_no");
		String employee_name=request.getParameter("employee_name");

		 // 数据库连接	
		 Connection conn = DBHelper.getConnection();
		 //student_no,student_name,student_sex,department,grade,
		 //professional,phonenumber,int_time,out_time,building_no,dormitory_no
		 String sql = "update employee set building_no=?,employee_no=?,employee_name=? where employee_no=?";
		// 获取PreparedStatement
			PreparedStatement ps = conn.prepareStatement(sql);
			// 对SQL语句中的第1个参数赋值
			ps.setString(1, building_no);
			// 对SQL语句中的第2个参数赋值
			ps.setString(2, employee_no);
			// 对SQL语句中的第3个参数赋值
			ps.setString(3, employee_name);
			// 对SQL语句中的第4个参数赋值
			ps.setString(4, employee_no);
			//执行更新操作
			ps.executeUpdate();
			//关闭PreparedStatement
			ps.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    //重定向到FindStuServlet
		response.sendRedirect("FindEmpServlet");
		
	}

	
}
