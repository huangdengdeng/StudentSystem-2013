package com.stu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stu.dao.LaterecordDao;
import com.stu.dao.StudentsDAO;
import com.stu.entity.Laterecord;
import com.stu.entity.Students;

public class FindByStunoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L; 
	/**
	 * Constructor of the object.
	 */
	public FindByStunoServlet() {
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
	
		LaterecordDao laterecorddao = new LaterecordDao();
		Laterecord laterecord = new Laterecord();

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html ;charset=UTF-8");
		
		String students_no = request.getParameter("students_no");
		
		laterecord.setStudent_no(students_no);
		
		try {
			//String personNo=(String) request.getSession().getAttribute("personNo");
			//student.setStudent_no(students_no);
			
			List<Laterecord> list = laterecorddao.queryByStuno(laterecord);
			
			request.setAttribute("list", list);
		} catch (Exception e) {
			e.printStackTrace();
		}

		request.getRequestDispatcher("findrecord.jsp").forward(request, response);

	}

}
