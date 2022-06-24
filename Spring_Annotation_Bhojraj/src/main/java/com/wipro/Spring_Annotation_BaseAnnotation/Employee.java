package com.wipro.Spring_Annotation_BaseAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	private int id;
	
	@Value("${Emp_Name}")		// to retrieve value from application.properties
	private String name;
	
	@Value("${Emp_Band}")
	private String band;
	
	@Autowired 					//to inject different class object to other class
	//@Qualifier("taddress")	//same as Primary, only work with bean name(taddress), Qualifier>Primary
	EmpAddress address;
	
	public EmpAddress getAddress() {
		return address;
	}
	public void setAddress(EmpAddress address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", band=" + band + "]";
		
	}
}
