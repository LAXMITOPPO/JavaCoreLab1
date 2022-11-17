

/*
 * Daimond pattern
 * @Author :Laxmi Toppo
 * @Date :3 nov 2022
 */
//declaring package
package com.ques1;

import java.util.Scanner;
//declaring class
public class DaimondTest {
//start main
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		Daimond sc1= new Daimond();
		
		int n;
		
		//take input
		System.out.println("Enter the rows of numbers :");
		n=sc.nextInt();
		
		//call printpattern
		sc1.printpattern(n);
		sc.close();
	}//end main

}//end class
