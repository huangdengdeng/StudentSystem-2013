<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@page import="java.util.List"%>
<%@page import="com.stu.entity.Students"%>
<%@page import="com.stu.dao.StudentsDAO"%>
			  <form method="post"  action="FindByNoServlet">
  
      <label class="B" for="students_no">学号:</label>
      <input type="text"  name="students_no"  value="" />
      <input  class="B" type="submit" value="搜索"  name="submit" />
     
   
          </form>	
<table align="center" width="1050" border="1" height="180" bordercolor="white" bgcolor="black" cellpadding="1" cellspacing="1">
        
		<tr bgcolor="white">
			<td align="center" colspan="14">
				<h2>学生信息</h2>
			</td>
		</tr>
		<tr align="center" bgcolor="#e1ffc1" >
		    <td><b>序号</b></td>       
			<td><b>学号</b></td>
			<td><b>姓名</b></td>
			<td><b>性别</b></td>
			<td><b>院系</b></td>
			<td><b>年级</b></td>
			<td><b>专业</b></td>
			<td><b>电话号码</b></td>
			<td><b>入住时间 </b></td>
			<td><b>离开时间</b></td>
			<td><b>宿舍楼号</b></td>
			<td><b>宿舍房号 </b></td>
			<td><b>修改信息 </b></td>
			<td><b>删除</b></td>
		</tr>
			<%
				// 获取图书信息集合
						List<Students> list = (List<Students>)request.getAttribute("list");
						// 判断集合是否有效
						if(list == null || list.size() < 1){
							out.print("没有数据！");
						}else{
							// 遍历图书集合中的数据
							for(Students s : list){
			%>
	   
	   
	  
	
				<tr align="center" bgcolor="white">
					<td><%=s.getId()%></td>
					<td><%=s.getStudent_no()%></td>
					<td><%=s.getStudent_name()%></td>
					<td><%=s.getStudent_sex()%></td>
					<td><%=s.getDepartment()%></td>
					
					<td><%=s.getGrade()%></td>
					<td><%=s.getProfessional()%></td>
					<td><%=s.getPhonenumber()%></td>
					<td><%=s.getInt_time()%></td>
					<td><%=s.getOut_time()%></td>
					
					<td><%=s.getBuilding_no()%></td>
					<td><%=s.getDormitory_no()%></td>
					<td>
					<a href="updatestu.jsp?id=<%=s.getId()%>&student_no=<%=s.getStudent_no()%>&student_name=<%=s.getStudent_name()%>&student_sex=<%=s.getStudent_sex()%>&department=<%=s.getDepartment()%>&grade=<%=s.getGrade()%>&professional=<%=s.getProfessional()%>&phonenumber=<%=s.getPhonenumber()%>&int_time=<%=s.getInt_time()%>&out_time=<%=s.getOut_time()%>&building_no=<%=s.getBuilding_no()%>&dormitory_no=<%=s.getDormitory_no()%>">修改</a>
					</td>
					<td>
					<a href="DeleteStuServlet?id=<%=s.getId()%>">删除</a>
					</td>
				</tr>
			<%
					}
				}
			%>
	</table>

	</form>