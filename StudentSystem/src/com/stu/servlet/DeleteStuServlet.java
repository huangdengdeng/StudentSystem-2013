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

public class DeleteStuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * Constructor of the object.
	 */
	public DeleteStuServlet() {
		super();
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		int id=Integer.valueOf(request.getParameter("id"));
		// ���ݿ�����	
		 try {
			Connection conn = DBHelper.getConnection();
			String sql = "delete from student where id=?";
			// ��ȡPreparedStatement
			PreparedStatement ps = conn.prepareStatement(sql);
			//��sql����еĵ�һ��ռλ����ֵ
			ps.setInt(1, id);
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
			response.sendRedirect("FindStuServlet");
		
	}

	

}
