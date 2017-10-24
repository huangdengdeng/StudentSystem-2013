
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@page import="java.util.List"%>
<%@page import="com.stu.entity.Employee"%>
<%@page import="com.stu.dao.EmployeeDao"%>


<form action="UpdateEmpServlet" method="post" onsubmit="return check(this);">
		   <table align="center" width="450" >
		
			<tr>
				<td align="center" colspan="2">
					<h2>修改宿管员信息</h2>
					
				</td>
			</tr>
<%
		
		String building_no =new String(request.getParameter("building_no").getBytes("ISO-8859-1"),"utf-8");
		String employee_no =new String(request.getParameter("employee_no").getBytes("ISO-8859-1"),"utf-8");
		String employee_name =new String(request.getParameter("employee_name").getBytes("ISO-8859-1"),"utf-8");


 %>			
			<tr>
				<td align="right">宿舍楼号:</td>
				
				<td><input type="text" name="building_no" value="<%=building_no%>"/></td>
			</tr>
			<tr>
				<td align="right"> 编&nbsp;&nbsp;&nbsp;&nbsp;号:</td>
				<td><input type="text" name="employee_no" value="<%=employee_no%>"/></td>
			</tr>
			
			<tr>
				<td align="right">姓&nbsp;&nbsp;&nbsp;&nbsp;名：</td>
				<td><input type="text" name="employee_name" value="<%=employee_name%>"/></td>
			</tr>
			<tr>
				<td align="center" colspan="2">
					<input type="submit" value="确定">
				</td>
			</tr>	
		</table>
	</form>