package com.stu.service;



import com.stu.dao.EmployeeDao;

public class EmployeeService {
	/**
	 * ��¼
	 * @param name
	 * @param password
	 * @return
	 * @throws UserException
	 * @throws SQLException 
	 */
	
		
	public boolean isLogin(String employee_no, String employee_ps) throws Exception {
		boolean isT=false;
		EmployeeDao employeedao=new EmployeeDao();
		String employee_no1=employeedao.findByEmployeeNo(employee_no);
		//System.out.println(employee_no);
		try {
			if(employeedao.isLogin(employee_no1, employee_ps)){
					isT=true;	
			}else if(employee_no1==null)throw new Exception("�û��������ڣ�");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return isT;
		}
}
