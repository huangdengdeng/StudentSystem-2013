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

public class UpdateStuServlet extends HttpServlet {
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
		int id=Integer.valueOf(request.getParameter("id"));
		String student_no=request.getParameter("student_no");
		String student_name=request.getParameter("student_name");
		String student_sex=request.getParameter("student_sex");
		String department=request.getParameter("department");
		String grade=request.getParameter("grade");
		String professional=request.getParameter("professional");
		String phonenumber=request.getParameter("phonenumber");
		String int_time=request.getParameter("int_time");
		String out_time=request.getParameter("out_time");
		String building_no=request.getParameter("building_no");
		String dormitory_no=request.getParameter("dormitory_no");
		 // 数据库连接	
		 Connection conn = DBHelper.getConnection();
		 //student_no,student_name,student_sex,department,grade,
		 //professional,phonenumber,int_time,out_time,building_no,dormitory_no
		 String sql = "update student set student_no=?,student_name=?,student_sex=?,department=?,grade=?,professional=?,phonenumber=?,int_time=?,out_time=?,building_no=?,dormitory_no=? where id=?";
		// 获取PreparedStatement
			PreparedStatement ps = conn.prepareStatement(sql);
			// 对SQL语句中的第1个参数赋值
			ps.setString(1, student_no);
			// 对SQL语句中的第2个参数赋值
			ps.setString(2, student_name);
			// 对SQL语句中的第3个参数赋值
			ps.setString(3, student_sex);
			// 对SQL语句中的第4个参数赋值
			ps.setString(4, department);
			// 对SQL语句中的第5个参数赋值
			ps.setString(5, grade);
			// 对SQL语句中的第6个参数赋值
			ps.setString(6, professional);
			// 对SQL语句中的第7个参数赋值
			ps.setString(7, phonenumber);
			// 对SQL语句中的第8个参数赋值
			ps.setString(8, int_time);
			// 对SQL语句中的第9个参数赋值
			ps.setString(9, out_time);
			// 对SQL语句中的第10个参数赋值
			ps.setString(10, building_no);
			// 对SQL语句中的第11个参数赋值
			ps.setString(11, dormitory_no);
			// 对SQL语句中的第12个参数赋值
			ps.setInt(12, id);
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
		response.sendRedirect("FindStuServlet");
		
	}

	

}
