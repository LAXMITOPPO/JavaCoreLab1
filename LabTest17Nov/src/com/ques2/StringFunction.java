/*
 * Write 5 funtion of string in java program
 * @author : Laxmi Toppo
 * @Date : 17 Nov 2022
 */
package com.ques2;

import java.util.Scanner;
//declaring class
public class StringFunction {
     //start main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String s1,s2;
		//String s1="Anudip"; 
		Scanner sc=new Scanner(System.in);
		//String s2=s1;
		System.out.println("Enter two String s1 and s2 ");
		s1=sc.nextLine();
		s2=sc.nextLine();
		s1=s1.concat(s2);// using function 1
		System.out.println(s1);//immuttable
		if(s1.equals(s2)) //using function 2
		{
			System.out.println("equale");
		}
		else
		{
			System.out.println("not equal");
		}
		System.out.println(s1.length());//using function 3
		System.out.println(s1.isEmpty());//using function 4
		System.out.println(s2.isEmpty());
		System.out.println(s1.toUpperCase());//using function 5
		System.out.println("uppercase");
		System.out.println(s1.toLowerCase());
	}//end main
}//end class


