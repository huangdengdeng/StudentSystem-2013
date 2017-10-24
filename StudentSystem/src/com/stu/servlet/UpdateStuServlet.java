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
		//��ȡ����
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
		 // ���ݿ�����	
		 Connection conn = DBHelper.getConnection();
		 //student_no,student_name,student_sex,department,grade,
		 //professional,phonenumber,int_time,out_time,building_no,dormitory_no
		 String sql = "update student set student_no=?,student_name=?,student_sex=?,department=?,grade=?,professional=?,phonenumber=?,int_time=?,out_time=?,building_no=?,dormitory_no=? where id=?";
		// ��ȡPreparedStatement
			PreparedStatement ps = conn.prepareStatement(sql);
			// ��SQL����еĵ�1��������ֵ
			ps.setString(1, student_no);
			// ��SQL����еĵ�2��������ֵ
			ps.setString(2, student_name);
			// ��SQL����еĵ�3��������ֵ
			ps.setString(3, student_sex);
			// ��SQL����еĵ�4��������ֵ
			ps.setString(4, department);
			// ��SQL����еĵ�5��������ֵ
			ps.setString(5, grade);
			// ��SQL����еĵ�6��������ֵ
			ps.setString(6, professional);
			// ��SQL����еĵ�7��������ֵ
			ps.setString(7, phonenumber);
			// ��SQL����еĵ�8��������ֵ
			ps.setString(8, int_time);
			// ��SQL����еĵ�9��������ֵ
			ps.setString(9, out_time);
			// ��SQL����еĵ�10��������ֵ
			ps.setString(10, building_no);
			// ��SQL����еĵ�11��������ֵ
			ps.setString(11, dormitory_no);
			// ��SQL����еĵ�12��������ֵ
			ps.setInt(12, id);
			//ִ�и��²���
			ps.executeUpdate();
			//�ر�PreparedStatement
			ps.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    //�ض���FindStuServlet
		response.sendRedirect("FindStuServlet");
		
	}

	

}
