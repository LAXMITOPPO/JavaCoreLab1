/*
 *create a recode of students using array in java
 * @Author :Laxmi Toppo
 * @Date :10 nov 2022
 */
//declaring package
package com.ques1;
//declaring class
public class Student {

	//take variables
	int Sid;
	String Sname;
	String course;
	
	//student class constructor
	public  Student(int id,String name,String course) {
		this.Sid=id;
		this.Sname=name;
		this.course=course;
	}
	
    //display student details
	public void display()
	{
		System.out.println("Studentid=" + Sid +" "+"Studentname="+Sname+" "+"course="+ course);
		System.out.println();
	}

	
	
}//end class
