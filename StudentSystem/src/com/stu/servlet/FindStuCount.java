package com.stu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.stu.dao.StudentsDAO;
import com.stu.entity.Students;
import com.stu.entity.StudentsCount;
import com.stu.util.DBHelper;

public class FindStuCount extends HttpServlet {
	
	
private static final long serialVersionUID = 1L; 
	

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		    // ʵ����StudentDao
				StudentsDAO dao = new StudentsDAO();
				List<StudentsCount> list = dao.findStudentsCount();
				// ��ͼ�鼯�Ϸ��õ�request֮��
				request.setAttribute("list", list);
				// ����ת����findstu.jsp
				request.getRequestDispatcher("stucount.jsp").forward(request, response);
			}

}
