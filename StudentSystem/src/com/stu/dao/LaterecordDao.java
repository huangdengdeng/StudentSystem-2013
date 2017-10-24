package com.stu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.stu.entity.Employee;
import com.stu.entity.Laterecord;
import com.stu.entity.Students;

import com.stu.util.DBHelper;

public class LaterecordDao {
	/**
	 * 添加记录信息
	 * 
	 */
	public int saveRecord(Laterecord laterecord){
		System.out.println(laterecord+"****");
	
		int row =0;
	try{
		 // 数据库连接	
	 Connection conn = DBHelper.getConnection();
	 
	String sql = "insert into laterecord(student_no,student_name,building_no,dormitory_no,date) values(?,?,?,?,?)";
	// 获取PreparedStatement
	PreparedStatement ps = conn.prepareStatement(sql);
	// 对SQL语句中的第1个参数赋值
	ps.setString(1, laterecord.getStudent_no());
	// 对SQL语句中的第2个参数赋值
	ps.setString(2, laterecord.getStudent_name());
	// 对SQL语句中的第3个参数赋值
	ps.setString(3, laterecord.getBuilding_no());
	// 对SQL语句中的第4个参数赋值
	ps.setString(4, laterecord.getDormitory_no());
	// 对SQL语句中的第5个参数赋值
	ps.setString(5, laterecord.getDate());
	// 执行更新操作，返回所影响的行数
	row = ps.executeUpdate();
	
	// 关闭PreparedStatement
				ps.close();
			}
	catch (Exception e) {
				e.printStackTrace();
			}
	
	return row;
	
			
		}
	
	
	
	/**
	 * 查询晚归信息
	 * @return List<Employee>
	 * @throws Exception 
	 */
	public List<Laterecord> findLaterecord() {
		Connection conn = null;
		
		// 实例化List对象
		List<Laterecord> list = new ArrayList<Laterecord>();
		try {
			// 数据库连接
			 conn = DBHelper.getConnection();
			// 获取Statement
				Statement stmt = conn.createStatement();
				// 添加图书信息的SQL语句
				String sql = "select student_no ,student_name,building_no,dormitory_no,date from laterecord";
				// 执行查询
				ResultSet rs = stmt.executeQuery(sql);
				// 光标向后移动，并判断是否有效
			// 光标向后移动，并判断是否有效
			while(rs.next()){

				Laterecord laterecord = new Laterecord();
				//student_no ,student_name,building_no,dormitory_no,date
				// 对所有属性赋值
				laterecord.setStudent_no(rs.getString("student_no"));
				laterecord.setStudent_name(rs.getString("student_name"));
				laterecord.setBuilding_no(rs.getString("building_no"));
				laterecord.setDormitory_no(rs.getString("dormitory_no"));
				laterecord.setDate(rs.getString("date"));
				// 将管理员对象添加到集合中
				list.add(laterecord);
			}
			rs.close();		// 关闭ResultSet
			stmt.close();	// 关闭Statement
			
		}catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	/*
	 * 	
	 */
		public List<Laterecord> queryByStuno(Laterecord laterecord) throws SQLException {
			//System.out.println("学号+考勤日期："+students);
			Connection con = null;
			PreparedStatement pstmt = null;
				try {
					con = DBHelper.getConnection();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String sql = "select student_no,student_name,building_no,dormitory_no,date from laterecord where student_no=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, laterecord.getStudent_no());
				
				ResultSet rs = pstmt.executeQuery();
				List<Laterecord> list = new ArrayList<Laterecord>(); 
				while(rs.next()){
					// 实例化Book对象 id student_no,student_name,student_sex,department,grade,
					//professional,phonenumber,int_time,out_time,building_no,dormitory_no 
					
					Laterecord record=new Laterecord();

					// 2 对name属性赋值
					record.setStudent_no(rs.getString("student_no"));
					// 3 对sex属性赋值
					record.setStudent_name(rs.getString("student_name"));
					// 4 对sex属性赋值
					record.setBuilding_no(rs.getString("building_no"));
				 	//5 对age属性赋值
					record.setDormitory_no(rs.getString("dormitory_no"));
					record.setDate(rs.getString("date"));					

					// 将图书对象添加到集合中
					list.add(record);
			}
			
			return list;
		}


}
