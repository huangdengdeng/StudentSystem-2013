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

public class DeleteRecordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * Constructor of the object.
	 */
	public DeleteRecordServlet() {
		super();
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String student_no = request.getParameter("student_no");
		// ���ݿ�����	
		 try {
			Connection conn = DBHelper.getConnection();
			String sql = "delete from laterecord where student_no=?";
			// ��ȡPreparedStatement
			PreparedStatement ps = conn.prepareStatement(sql);
			//��sql����еĵ�һ��ռλ����ֵ
			ps.setString(1, student_no);
			//ִ�и��²���
			ps.executeUpdate();
			//�ر�PreparedStatement
			ps.close();
			//�ر�Connection
			
			
		} 
		 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//�ض���FindStuServlet
			response.sendRedirect("FindRecordServlet");
		
	}

	

}
