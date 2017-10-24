package com.stu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stu.dao.EmployeeDao;
import com.stu.entity.Employee;

public class AddEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L; 
	/**
	 * Constructor of the object.
	 */
	public AddEmpServlet() {
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
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		// building_no  employee_no  employee_name  employee_ps 
		String building_no = request.getParameter("building_no");
		String employee_no = request.getParameter("employee_no");
		String employee_name = request.getParameter("employee_name");
		String employee_ps = request.getParameter("employee_ps");
		// 实例化employee
		Employee employee=new Employee(building_no,employee_no,employee_name,employee_ps);
		// 实例化employeeDao
		EmployeeDao employeedao=new EmployeeDao();
		// 添加学生信息
		int row = employeedao.saveEmployee(employee);
		if(row > 0){
			// 更新成输出信息
			out.print("Successfully added employee" + row + "data！");
			
		}else{
			out.print("Add employee data failure！");
		}
		out.flush();
		out.close();
	}
	public void init() throws ServletException {
		// Put your code here
	}

}
