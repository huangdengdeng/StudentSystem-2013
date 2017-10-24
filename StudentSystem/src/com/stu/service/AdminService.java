package com.stu.service;

import com.stu.dao.AdminDao;
import com.stu.dao.EmployeeDao;

public class AdminService {
	public boolean isLogin(String admin_id, String admin_ps) throws Exception {
		boolean isT=false;
		AdminDao admindao=new AdminDao();
		String admin_id1=admindao.findByAdminNo(admin_id);
		//System.out.println(employee_no);
		try {
			if(admindao.isLogin(admin_id1, admin_ps)){
					isT=true;	
			}else if(admin_id1==null)throw new Exception("用户名不存在！");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return isT;
		}
}
