/*
	 * check palindrome number
	 * @auther : Laxmi Toppo
	 * @Date: 22 dec 2022
	 */

package question3;

import java.util.Scanner;
//start class
public class Palindrome {
   //start main
	public static void main(String[] args) {
	
	  Scanner sc=new Scanner(System.in);
	  
	  //take input
	  System.out.println("Enter any number");
	  int num=sc.nextInt();
	  
	  //take variables
	    int rev=0,rem;
		int temp = num;//store the number to temp
		
		//start while 
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
			}
		//check if  "temp"  and "rev" are equal or not .
		if(temp==rev) {
			System.out.println("This is  palindrome number:");
		}
		else {
			System.out.println("This is not palindrome number:");
	
		}//end loop
   }//end main
}//end class
