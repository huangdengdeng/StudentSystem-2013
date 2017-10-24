<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@page import="java.util.List"%>
<%@page import="com.stu.entity.Laterecord"%>
<%@page import="com.stu.dao.LaterecordDao"%>

<form method="post"  action="FindByStunoServlet">
  
      <label class="B" >学号:</label>
      <input type="text"  name="students_no"  value="" />
      <input  class="B" type="submit" value="搜索"  name="submit" />
     
   
 </form>	
<table align="center" width="1050" border="1" height="180" bordercolor="white" bgcolor="black" cellpadding="1" cellspacing="1">
        
		<tr bgcolor="white">
			<td align="center" colspan="14">
				<h2>晚归记录</h2>
			</td>
		</tr>
		<tr align="center" bgcolor="#e1ffc1" >

		    <td><b>学号</b></td>       
			<td><b>姓名</b></td>
			<td><b>宿舍楼号</b></td>
			<td><b>宿舍房号</b></td>
			<td><b>晚归日期</b></td>
			<td><b>删除</b></td>
		</tr>
			<%
				// 获取图书信息集合
						List<Laterecord> list = (List<Laterecord>)request.getAttribute("list");
						// 判断集合是否有效
						if(list == null || list.size() < 1){
							out.print("没有数据！");
						}else{
							// 遍历图书集合中的数据
							for(Laterecord l : list){
			%>
	   
	   
	  
	
				<tr align="center" bgcolor="white">
					<td><%=l.getStudent_no()%></td>
					<td><%=l.getStudent_name()%></td>
					<td><%=l.getBuilding_no()%></td>
					<td><%=l.getDormitory_no()%></td>
					<td><%=l.getDate()%></td>
					
					<td>
					<a href="DeleteRecordServlet?student_no=<%=l.getStudent_no()%>">删除</a>
					</td>                   
				</tr>
			<%
					}
				}
			%>
	</table>
