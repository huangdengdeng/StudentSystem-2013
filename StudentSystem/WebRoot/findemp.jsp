<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@page import="java.util.List"%>
<%@page import="com.stu.entity.Employee"%>
<%@page import="com.stu.dao.EmployeeDao"%>

<form method="post"  action="FindByEmIdServlet ">
  
      <label class="B" >编号:</label>
      <input type="text"  name="employee_no"  value="" />
      <input  class="B" type="submit" value="搜索"  name="submit" />
     
   
 </form>	
<table align="center" width="1050" border="1" height="180" bordercolor="white" bgcolor="black" cellpadding="1" cellspacing="1">
        
		<tr bgcolor="white">
			<td align="center" colspan="14">
				<h2>管理员信息</h2>
			</td>
		</tr>
		<tr align="center" bgcolor="#e1ffc1" >
	
		    <td><b>宿舍楼号</b></td>       
			<td><b>编号</b></td>
			<td><b>姓名</b></td>
			<td><b>修改信息 </b></td>
			<td><b>删除</b></td>
		</tr>
			<%
				// 获取图书信息集合
						List<Employee> list = (List<Employee>)request.getAttribute("list");
						// 判断集合是否有效
						if(list == null || list.size() < 1){
							out.print("没有数据！");
						}else{
							// 遍历图书集合中的数据
							for(Employee e : list){
			%>
	   
	   
	  
	
				<tr align="center" bgcolor="white">
					<td><%=e.getBuilding_no()%></td>
					<td><%=e.getEmployee_no()%></td>
					<td><%=e.getEmployee_name()%></td>
					<td>
					<a href="updateemp.jsp?building_no=<%=e.getBuilding_no()%>&employee_no=<%=e.getEmployee_no()%>&employee_name=<%=e.getEmployee_name()%>">修改</a>
					</td>
					<td>
					<a href="DeleteEmpServlet?employee_no=<%=e.getEmployee_no()%>">删除</a>
					</td>                   
				</tr>
			<%
					}
				}
			%>
	</table>
