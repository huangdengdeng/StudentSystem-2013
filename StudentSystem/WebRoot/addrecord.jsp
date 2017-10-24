<%@ page  pageEncoding="utf-8"%>

<form action="AddRecordServlet" method="post" onsubmit="return check(this);">
		<table align="center" width="450" >
			<tr>
				<td align="center" colspan="2">
					<h2>添加晚归记录</h2>
		
				</td>
			</tr>
			<tr>
				<td align="right">学&nbsp;&nbsp;&nbsp;&nbsp;号:</td>
				<td><input type="text" name="student_no" /></td>
			</tr>
			<tr>
				<td align="right">姓&nbsp;&nbsp;&nbsp;&nbsp;名:</td>
				<td><input type="text" name="student_name" /></td>
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
				<td><input type="text" name="dormitory_no"  value=""/></td>
			</tr>
			<tr>
				<td align="right">晚归时间:</td>
				<td><input type="text" name="date"  value="
				"/></td>
			</tr>
			<tr>
				<td align="center" colspan="2">
					<input type="submit" value="添　加">
				</td>
			</tr>
		</table>
	</form>