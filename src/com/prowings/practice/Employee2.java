package com.prowings.practice;

public class Employee2 {
	
	
	String fullnamestname;
	
	public Employee2(String fullnamestname) {
		super();
		this.fullnamestname = fullnamestname;
		//this.sisrename = sisrename;
	}
	
	public String getlastname() {
		String[] parts= fullnamestname.split("\\s+");
		String ls= parts[1];
		return ls;
	
		
	}
	
	public String getFristname() {
		return fullnamestname;
	}
	public void setFristname(String fristname) {
		this.fullnamestname = fullnamestname;
	}
	@Override
	public String toString() {
		return "Employee2 [fullnamestname=" + fullnamestname + "]";
	}
	
	

}
