package com.stu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stu.dao.StudentsDAO;
import com.stu.entity.Students;

public class FindByNoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L; 
	/**
	 * Constructor of the object.
	 */
	public FindByNoServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		StudentsDAO studentsdao = new StudentsDAO();
		Students student = new Students();

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html ;charset=UTF-8");
		
		String students_no = request.getParameter("students_no");
		
		student.setStudent_no(students_no);
		
		try {
			//String personNo=(String) request.getSession().getAttribute("personNo");
			//student.setStudent_no(students_no);
			
			List<Students> list = studentsdao.queryBySno(student);
			
			request.setAttribute("list", list);
		} catch (Exception e) {
			e.printStackTrace();
		}

		request.getRequestDispatcher("findstu.jsp").forward(request, response);

	}

}
