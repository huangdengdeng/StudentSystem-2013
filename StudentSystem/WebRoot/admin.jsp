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
  <style>
  body{
  background-color:#E0FFFF;
  }
   .left
{
position:absolute;
left:8px;

width:15%;
height: 80%;

}
  .right
{
position:absolute;
right:8px;
top:125px;
width:85%;
height: 80%;
padding:0px;

}
#header {
    color:#FFFFFF;
    text-align:center;
    width:100%;
    height: 20%;
    background: -webkit-linear-gradient(bottom,#00CED1,#87CEFA); /* Safari 5.1 - 6.0 */
    background: -o-linear-gradient(top,#00CED1, #87CEFA); /* Opera 11.1 - 12.0 */
    background: -moz-linear-gradient(top,#00CED1,#87CEFA); /* Firefox 3.6 - 15 */
    background: linear-gradient(to top,#00CED1,#87CEFA); /* 标准的语法（必须放在最后） */
    
}

ul
{
list-style-type:none;
margin:0;
padding:0;
}
a:link,a:visited   /*:link向未访问的链接添加特殊的样式。:visited 选择器设置访问过的页面链接的样式*/
{
display:block;
font-weight:bold;
color:#1E90FF;
background-color:#E0FFFF;
width:150px;
text-align:center;
padding:4px;
text-decoration:none;
text-transform:uppercase;
}
a:hover,a:active   /* 使用:hover选择器当有鼠标悬停在其上的链接样式，:active 选择器设置当你点击链接时的样式。*/
{
background-color:#B0E0E6;
}
span{
    font-weight:bold;
    
    font-size:xx-large;
}
</style>
  <body>
  <div id="container" style="width:100%;height:100%">
 
    <div id="header"><span>学生宿舍管理系统</span></div>
<div class="left">
    <ul>
<li><a href="admin.jsp"  >首页</a></li>
<li><a href="addemp.jsp" target="iframe_a">添加宿管员</a></li>
<li><a href="FindEmpServlet" target="iframe_a">宿管员管理</a></li>
<li><a href="FindStuServlet"  target="iframe_a">学生信息管理</a></li>
  </ul>

  </div>
  <div class="right"><iframe src="  " width="100%" height="100%" name="iframe_a" style="border:2px solid #66CDAA"></iframe></div>
    </div>


  </body>
</html>
