package com.stu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stu.dao.LaterecordDao;
import com.stu.entity.Laterecord;



public class AddRecordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L; 
	/**
	 * Constructor of the object.
	 */
	public AddRecordServlet() {
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
			    //student_no ,student_name,building_no,dormitory_no,date
				//从页面 获取性别
				String student_no = request.getParameter("student_no");
				// 获取年龄
				String student_name = request.getParameter("student_name");
				// 获取班级
				String building_no = request.getParameter("building_no");
				// 获取姓名
				String dormitory_no = request.getParameter("dormitory_no");
				// 获取性别
				String date = request.getParameter("date");
				
				Laterecord laterecord=new Laterecord(student_no,student_name,building_no,dormitory_no,date);
				
				// 实例化LaterecordDao
				LaterecordDao dao=new LaterecordDao();
				
				// 添加学生信息
				int row = dao.saveRecord(laterecord);
				if(row > 0){
					// 更新成输出信息
					out.print("Successfully added " + row + " data！");
					
				}else{
					out.print("Add data failure！");
				}
				out.flush();
				out.close();
			}
}
