package com.stu.servlet;

import com.stu.entity.Students;
import com.stu.dao.StudentsDAO;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddStuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L; 
	/**
	 * Constructor of the object.
	 */
	public AddStuServlet() {
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
		       // 设置response的编码
				//response.setCharacterEncoding("utf-8");
				// 获取PrintWriter
				PrintWriter out = response.getWriter();
				// 设置request的编码
				//request.setCharacterEncoding("utf-8");
				// 获取姓名
				
				//从页面 获取性别
				String student_no = request.getParameter("student_no");
				// 获取年龄
				String student_name = request.getParameter("student_name");
				// 获取班级
				String student_sex = request.getParameter("student_sex");
				// 获取姓名
				String department = request.getParameter("department");
				// 获取性别
				String grade = request.getParameter("grade");
				// 获取年龄
				String professional = request.getParameter("professional");
				// 获取班级
				String phonenumber = request.getParameter("phonenumber");
				// 获取姓名
				String int_time = request.getParameter("int_time");
				// 获取性别
				String out_time = request.getParameter("out_time");
				// 获取年龄
				String building_no = request.getParameter("building_no");
				// 获取班级
				String dormitory_no = request.getParameter("dormitory_no");
				// 实例化student
				Students students = new Students(student_no,student_name,student_sex,department,grade,professional,phonenumber,int_time,out_time,building_no,dormitory_no);	
				// 实例化StudentDao
				StudentsDAO dao = new StudentsDAO();
				// 添加学生信息
				int row = dao.saveStudent(students);
				if(row > 0){
					// 更新成输出信息
					out.print("Successfully added" + row + "data！");
					
				}else{
					out.print("Add data failure！");
				}
				out.flush();
				out.close();
			}
	



	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
