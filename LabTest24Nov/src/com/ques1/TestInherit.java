/*

 * @auther : Laxmi Toppo
 * @Date: 24 nov 2022
 */
package com.ques1;
//start class
public class TestInherit {
    //start main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s= new Student();
		//calling the methods
		s.setID(101);
		s.setFirstname("laxmi");
		s.setLastname("toppo");
		s.setAge(22);
		s.setCourse("MCA");
		System.out.println(s);
		
		employe e= new employe();
		//calling the methods
		e.setID(102);
		e.setFirstname("Mohan");
		e.setLastname("Kumar");
		e.setAge(35);
		e.setDept("IT");
		e.setDesignation("ITsector");
		e.setSalary(500000000);
		System.out.println(e);
	}//end main

}//end class
