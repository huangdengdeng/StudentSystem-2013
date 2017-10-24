<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@page import="java.util.List"%>

<%@page import="com.stu.entity.StudentsCount"%>
<%@page import="com.stu.dao.StudentsDAO"%>

<table align="center" width="1050" border="1" height="180" bordercolor="white" bgcolor="black" cellpadding="1" cellspacing="1">
        
		<tr bgcolor="white">
			<td align="center" colspan="4">
				<h2>宿舍人数查询</h2>
			</td>
		</tr>
		<tr align="center" bgcolor="#e1ffc1" >
		    <td><b>宿舍楼号</b></td>       
			<td><b>宿舍房号</b></td>
			<td><b>宿舍总人数</b></td>
			<td><b>添加人数</b></td>
		</tr>
			<%
				// 获取图书信息集合
						List<StudentsCount> list = (List<StudentsCount>)request.getAttribute("list");
						// 判断集合是否有效
						if(list == null || list.size() < 1){
							out.print("没有数据！");
						}else{
							// 遍历图书集合中的数据
							for(StudentsCount c : list){
							
							if(c.getPerson_count()<8){
			%>
	   
	   
	  
	
				<tr align="center" bgcolor="white">
					<td><%=c.getBuilding_no()%></td>
					<td><%=c.getDormitory_no()%></td>
					<td><%=c.getPerson_count()%></td>
					<td><a href="addstu.jsp">添加</a></td>
				</tr>
			<%
					}
				}
			}
			%>
	</table>

	</form>