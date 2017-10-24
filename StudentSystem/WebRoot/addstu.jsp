<%@ page  pageEncoding="utf-8"%>

<form action="servlet/AddStuServlet" method="post" onsubmit="return check(this);">
		<table align="center" width="450" >
			<tr>
				<td align="center" colspan="2">
					<h2>添加学生</h2>
					
				</td>
			</tr>
			
			<tr>
				<td align="right">学&nbsp;&nbsp;&nbsp;&nbsp;号:</td>
				<td><input type="text" name="student_no" /></td>
			</tr>
			<tr>
				<td align="right"> 姓&nbsp;&nbsp;&nbsp;&nbsp;名:</td>
				<td><input type="text" name="student_name" /></td>
			</tr>
			<tr>
			<td align="right">性&nbsp;&nbsp;&nbsp;&nbsp;别：</td>
			<td>
				<input type="radio" name="student_sex" value="男" checked="checked"/>男
				<input type="radio" name="student_sex" value="女"/>女
			</td>
		    </tr>
			
			<tr>
			<td align="right">院&nbsp;&nbsp;&nbsp;&nbsp;系:</td>
			<td>
				<select name="department">
					<option value="信电学院" selected="selected">信电学院</option>
					<option value="机械与化工学院" selected="selected">机械与化工学院</option>
					<option value="国际交流学院" selected="selected">国际交流学院</option>
					<option value="师范学院" selected="selected">师范学院</option>
					<option value="文法学院" selected="selected">文法学院</option>
					<option value="宝石与设计学院" selected="selected">宝石与设计学院</option>
					<option value="经济管理学院" selected="selected">经济管理学院</option>
					
				</select>
			</td>
			<tr>
			<td align="right">年&nbsp;&nbsp;&nbsp;&nbsp;级:</td>
			<td>
				<select name="grade">
					<option value="2012" selected="selected">2012</option>
					<option value="2013" selected="selected">2013</option>
					<option value="2014" selected="selected">2014</option>
					<option value="2015" selected="selected">2015</option>
					
				</select>
			</td>
		    </tr>
			<tr>
				<td align="right">专&nbsp;&nbsp;&nbsp;&nbsp;业:</td>
				<td><input type="text" name="professional" /></td>
			</tr>
			<tr>
				<td align="right">电话号码:</td>
				<td><input type="text" name="phonenumber" /></td> 
			</tr>
			<tr>
				<td align="right">入住时间:</td>
				<td><input type="text" name="int_time" /></td>
			</tr>
			<tr>
				<td align="right">离开时间:</td>
				<td><input type="text" name="out_time" /></td>
			</tr>
			<tr>
			<td align="right">宿舍楼号:</td>
			<td>
				<select name="building_no">
					<option value="A1" selected="selected">A1</option>
					<option value="A2" selected="selected">A2</option>
					<option value="A3" selected="selected">A3</option>
					<option value="A4" selected="selected">A4</option>
					<option value="A5" selected="selected">A5</option>
					<option value="A6" selected="selected">A6</option>
					<option value="A7" selected="selected">A7</option>
					<option value="A8" selected="selected">A8</option>
					<option value="A9" selected="selected">A9</option>
					<option value="A10" selected="selected">A10</option>
					<option value="A11" selected="selected">A11</option>
					
				</select>
			</td>
			<tr>
				<td align="right">宿舍房号:</td>
				<td><input type="text" name="dormitory_no" /></td>
			</tr>
			<tr>
				<td align="center" colspan="2">
					<input type="submit" value="添　加">
				</td>
			</tr>
		</table>
	</form>