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
		    // ʵ����StudentDao
				StudentsDAO dao = new StudentsDAO();
				List<Students> list = dao.findStudents();
				// ��ͼ�鼯�Ϸ��õ�request֮��
				request.setAttribute("list", list);
				// ����ת����findstu.jsp
				request.getRequestDispatcher("findstu.jsp").forward(request, response);
			}


}
