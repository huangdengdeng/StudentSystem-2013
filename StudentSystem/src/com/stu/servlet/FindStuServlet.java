package com.stu.servlet;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.stu.entity.Students;
import com.stu.dao.StudentsDAO;

public class FindStuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L; 
	

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		    // 实例化StudentDao
				StudentsDAO dao = new StudentsDAO();
				List<Students> list = dao.findStudents();
				// 将图书集合放置到request之中
				request.setAttribute("list", list);
				// 请求转发到findstu.jsp
				request.getRequestDispatcher("findstu.jsp").forward(request, response);
			}


}
