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
		       // ����response�ı���
				//response.setCharacterEncoding("utf-8");
				// ��ȡPrintWriter
				PrintWriter out = response.getWriter();
				// ����request�ı���
				//request.setCharacterEncoding("utf-8");
				// ��ȡ����
			    //student_no ,student_name,building_no,dormitory_no,date
				//��ҳ�� ��ȡ�Ա�
				String student_no = request.getParameter("student_no");
				// ��ȡ����
				String student_name = request.getParameter("student_name");
				// ��ȡ�༶
				String building_no = request.getParameter("building_no");
				// ��ȡ����
				String dormitory_no = request.getParameter("dormitory_no");
				// ��ȡ�Ա�
				String date = request.getParameter("date");
				
				Laterecord laterecord=new Laterecord(student_no,student_name,building_no,dormitory_no,date);
				
				// ʵ����LaterecordDao
				LaterecordDao dao=new LaterecordDao();
				
				// ���ѧ����Ϣ
				int row = dao.saveRecord(laterecord);
				if(row > 0){
					// ���³������Ϣ
					out.print("Successfully added " + row + " data��");
					
				}else{
					out.print("Add data failure��");
				}
				out.flush();
				out.close();
			}
}
