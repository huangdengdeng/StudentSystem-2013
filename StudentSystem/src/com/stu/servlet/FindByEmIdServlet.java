package com.stu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stu.dao.EmployeeDao;
import com.stu.entity.Employee;


public class FindByEmIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L; 
	/**
	 * Constructor of the object.
	 */
	public FindByEmIdServlet() {
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
	
        EmployeeDao employeedao = new EmployeeDao();

        Employee employee = new Employee();

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html ;charset=UTF-8");
		String employee_no = request.getParameter("employee_no");
		employee.setEmployee_no(employee_no);
		
		
		try {
			//String personNo=(String) request.getSession().getAttribute("personNo");
			//employee.setEmployee_no(employee_no);
			List<Employee> list = employeedao.queryByeID(employee);
			request.setAttribute("list", list);
		} catch (Exception e) {
			e.printStackTrace();
		}

		request.getRequestDispatcher("findemp.jsp").forward(request, response);

	}


}
