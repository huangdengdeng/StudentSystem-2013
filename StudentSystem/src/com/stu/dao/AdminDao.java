package com.stu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.stu.entity.Admin;

import com.stu.util.DBHelper;
public class AdminDao {
	
	public boolean isLogin(String admin_id, String admin_ps) throws Exception{
		boolean isT=false;
		Connection conn = DBHelper.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select admin_id,admin_id from admin where admin_id = '" + admin_id+ "' and admin_ps = '" + admin_ps + "'"); // 执行SQL 语句，查询数据库
		while (rs.next()) {
			isT = true;
	 	}
		rs.close();
		// 4、关闭数据库
		return isT;
	}
	
	
	
	
	public String findByAdminNo(String admin_id) throws SQLException {
		   Connection con=null;
		   ResultSet rs =null;
		   PreparedStatement pstmt =null;
		   try{
		    con=DBHelper.getConnection();;
			String sql = "SELECT * FROM  admin WHERE admin_id=?";
		    pstmt = con.prepareStatement(sql);
			pstmt.setString(1, admin_id);
			rs = pstmt.executeQuery();
			if(rs == null) {
				return null;
			}
			if(rs.next()) {
				Admin admin=new Admin();
				admin.setAdmin_id(rs.getString("admin_id"));
				admin.setAdmin_ps(rs.getString("admin_ps"));
			return admin_id;
			} else {
				return null;
			}
		} catch(Exception e) {
			throw new RuntimeException(e);
		} 
		}
	
}
