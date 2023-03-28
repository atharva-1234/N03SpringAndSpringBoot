package org.tnsif.springmvc;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int empid;
	private String empname;
	
	// getter and setter 
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	
	public void print ()
	{
		System.out.println("Employee belongs to IT Department ");
		System.out.println("EmpId: "+empid+ " "+" Employee name:"+empname);
	}
	
 /*
  * 
  */
}
