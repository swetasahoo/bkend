package com.company.rest.model;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {
	private String eid;
	private String ename;
	private float salary;
	private String rating;
	private String role;
	private String supervisorId;
	
	

	
	
	public Employee(String empNo, String empName, float salary, String rating, String role, String supervisor) {
		 this.eid = empNo;
	        this.ename = empName;
	        this.salary=salary;
	        this.role=role;
	        this.supervisorId=supervisor;
	}



	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	
	
	public String getSupervisorId() {
		return supervisorId;
	}



	public void setSupervisorId(String supervisorId) {
		this.supervisorId = supervisorId;
	}



	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}



	

}
