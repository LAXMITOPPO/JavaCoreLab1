/*
 * @auther : Laxmi Toppo
 * @Date: 24 nov 2022
 */
package com.ques1;
//start class
public class Student {
	private int ID;
	private String firstname;
	private String lastname;
	private String course;
	private int age;

	
	void Details(int Id,String sfname,String slname,int sage,String scourse) {
		int ID=Id; 
		String firstname=sfname;
		 String lastname=slname;
		 String course=scourse;
		int  age=sage;
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


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Student [ID=" + ID + ", firstname=" + firstname + ", lastname=" + lastname + ", course=" + course
				+ ", age=" + age + "]";
	}
	
}//end class
