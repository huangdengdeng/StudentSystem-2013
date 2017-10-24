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

public class DeleteEmpServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public DeleteEmpServlet() {
		super();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String employee_no=request.getParameter("employee_no");
		// 数据库连接	
		 try {
			Connection conn = DBHelper.getConnection();
			String sql = "delete from employee where employee_no=?";
			// 获取PreparedStatement
			PreparedStatement ps = conn.prepareStatement(sql);
			//对sql语句中的第一个占位符赋值
			ps.setString(1, employee_no);
			//执行更新操作
			ps.executeUpdate();
			//关闭PreparedStatement
			ps.close();
			//关闭Connection
			
			
		} 
		 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//重定向到FindStuServlet
			response.sendRedirect("FindEmpServlet");
		
	}

	
}
