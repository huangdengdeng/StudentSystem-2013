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
		//��ȡ����

		String building_no=request.getParameter("building_no");
		String employee_no=request.getParameter("employee_no");
		String employee_name=request.getParameter("employee_name");

		 // ���ݿ�����	
		 Connection conn = DBHelper.getConnection();
		 //student_no,student_name,student_sex,department,grade,
		 //professional,phonenumber,int_time,out_time,building_no,dormitory_no
		 String sql = "update employee set building_no=?,employee_no=?,employee_name=? where employee_no=?";
		// ��ȡPreparedStatement
			PreparedStatement ps = conn.prepareStatement(sql);
			// ��SQL����еĵ�1��������ֵ
			ps.setString(1, building_no);
			// ��SQL����еĵ�2��������ֵ
			ps.setString(2, employee_no);
			// ��SQL����еĵ�3��������ֵ
			ps.setString(3, employee_name);
			// ��SQL����еĵ�4��������ֵ
			ps.setString(4, employee_no);
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
		response.sendRedirect("FindEmpServlet");
		
	}

	
}
