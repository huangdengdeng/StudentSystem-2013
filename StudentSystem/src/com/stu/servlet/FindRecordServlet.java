package com.stu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stu.dao.EmployeeDao;
import com.stu.dao.LaterecordDao;
import com.stu.entity.Employee;
import com.stu.entity.Laterecord;

public class FindRecordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L; 
	

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		    // 实例化EmployeeDao

				LaterecordDao dao =new LaterecordDao();
				List<Laterecord> list = dao.findLaterecord();
				// 将图书集合放置到request之中
				request.setAttribute("list", list);
				// 请求转发到findstu.jsp
				request.getRequestDispatcher("findrecord.jsp").forward(request, response);
			}

}
