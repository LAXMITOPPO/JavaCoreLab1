/*
 * @auther : Laxmi Toppo
 * @Date: 24 nov 2022
 */
package com.ques1;
//start class
public class employe {
	//take variables
	private int ID;
	private String firstname;
	private String lastname;
	private int age;
	private float salary;
	private String dept;
	private String designation;
	void Details(int Id,String efname,String elname,int eage,float sal,String Dept,String desi) {
		int ID=Id; 
		String firstname=efname;
		 String lastname=elname;
		int  age=eage;
		float salary=sal;
		 String dept=Dept;
		 String designation=desi;
	 }



	public int getID() {
		return ID;
	}



	public void setID(int iD) {
		ID = iD;
	}



	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public float getSalary() {
		return salary;
	}



	public void setSalary(float d) {
		this.salary = d;
	}



	public String getDept() {
		return dept;
	}



	public void setDept(String dept) {
		this.dept = dept;
	}



	public String getDesignation() {
		return designation;
	}



	public void setDesignation(String designation) {
		this.designation = designation;
	}



	@Override
	public String toString() {
		return "employe [ID=" + ID + ", firstname=" + firstname + ", lastname=" + lastname + ", age=" + age
				+ ", salary=" + salary + ", dept=" + dept + ", designation=" + designation + "]";
	}

}//end class
