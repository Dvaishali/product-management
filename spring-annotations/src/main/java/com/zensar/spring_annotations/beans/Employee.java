package com.zensar.spring_annotations.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Value("${empId}")
	private int employeeId;
	@Value("${empName}")
	private String employeeName;
	@Value("${empAge}")
	private int employeeAge;
	
	@Autowired
	@Qualifier(value = "address2")
	private IAddress address;
	
	public Employee() {
		super();
	}
	
	//@Autowired
	public Employee(IAddress address) {
		super();
		this.address = address;
	}


	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
	public IAddress getAddress() {
		return address;
	}
	public void setAddress(IAddress address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAge=" + employeeAge
				+ ", address=" + address + "]";
	}
	public Employee(int employeeId, String employeeName, int employeeAge, IAddress address) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.address = address;
	}

	

}
