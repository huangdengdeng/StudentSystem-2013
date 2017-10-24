<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  
  
<style type="text/css">

body 
{
    background-size:100% 100%;
    background-image:url(images/login.jpg);
    background-repeat:no-repeat;
    background-attachment:fixed;
   
}

 #div1{  
  
    width:300px;
    height:150px;
	border:0px red solid;
	position:absolute;
    right:40%;
    top:45%;
  
    
}
.B {
	color: #6495ED;}
</style>
<body>

 <div id="div1">
 
  <form method="post" action="LoginServlet">
  
      <b><label class="B" for="user">账号:</label>
      <input type="text"  name="user" id="user" value="" /><br>
      <label  class="B" for="password">密码:  </label>
      <input type="password"  name="password" id="password" value="" /><br> 
      
      <label class="B">宿管员</label>
       <input type="radio" value="employee"  name="role" />
      <label class="B">管理员</label>
      <input type="radio" value="admin"  name="role" /><br>
      <input  class="B" type="submit" value="登陆"  name="submit" />
      <input class="B" type="reset" value="重置" name="reset" />
     </b>
 </form>

 </div>
  </body>
</html>
