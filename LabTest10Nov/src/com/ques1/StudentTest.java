/*
 *create a recode of students using array in java
 * @Author :Laxmi Toppo
 * @Date :10 nov 2022
 */
//declaring package
package com.ques1;

import java.util.Scanner;
//declaring class
public class StudentTest {
   ///start main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // take variables
		int Sid = 0;
		String Sname = null;
		String course = null;
		
		Scanner sc=new Scanner(System.in);
		Student st=new Student(Sid, Sname, course);
	
		Student[] st1=new Student[5];//create an array of student
		
		//create and initialize student details 
		st1[0]=new Student(101,"laxmi","mca");
		st1[1]=new Student(102,"rahul","BCA");
		st1[2]=new Student(103,"raju","BSC IT");
		st1[3]=new Student(104,"puja","MCA");
		st1[4]=new Student(105,"roshni","Btech");
		
		//display the student data
		System.out.println("serial no 1:");
		st1[0].display();

		System.out.println("serial no 2:");
		st1[1].display();
		

		System.out.println("serial no 3:");
		st1[2].display();
		

		System.out.println("serial no 4:");
		st1[3].display();
		

		System.out.println("serial no 5:");
		st1[4].display();
		
		sc.close();
	}//end main
    
}//end class
