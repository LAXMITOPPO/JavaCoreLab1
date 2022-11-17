/*
 * calculator using exception handling
 * @author : Laxmi Toppo
 * @Date : 17 Nov 2022
 */
package com.ques1;

import java.util.Scanner;
//start class
public class calulator {
//start main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
			int x=1;
			int a,b,c;
	do {  //start dowhile
		try {
             //take menu
			System.out.println("Menu  :");
		    System.out.println("1.Addition");
		    System.out.println("2.Substraction");
		    System.out.println("3.Multiplication");
		    System.out.println("4.Division");
		    System.out.println("5.Exit");
		    System.out.println("Input your choice :");
		       Scanner sc =new Scanner (System.in);
		   int choice=sc.nextInt();
		   
		    switch(choice) {
		    case 1:
		    	System.out.println("Enter two nos");//input variables
		        a=sc.nextInt();
		        b=sc.nextInt();
		        c=a+b;//calculate variable
		    	System.out.println("sum="+c);
		    	break;
		    case 2:
		    	System.out.println("Enter two nos");//input variables
		        a=sc.nextInt();
		        b=sc.nextInt();
		        c=a-b;//calculate variable
		    	System.out.println("Substaction="+c);
		    	break;
		    case 3:
		    	System.out.println("Enter two nos");//input variables
		        a=sc.nextInt();
		        b=sc.nextInt();
		        c=a*b;//calculate variable
		    	System.out.println("Multiplication="+c);
		    	break;
		    case 4:
		    	System.out.println("Enter two nos");//input variables
		        a=sc.nextInt();
		        b=sc.nextInt();
		        c=a/b;//calculate variable
		    	System.out.println("Division="+c);
		    	break;
		    case 5:
		    	System.out.println(" Now Exit.....");
		    	break;
		    }//end switch case
		   }catch (Exception e) {
			   System.out.println("wrong input....try again");
		   }
		 }while(x==1);//end dowhile
   }//end main
}//end class


