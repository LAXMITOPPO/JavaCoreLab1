/*
	 * check prime number
	 * @auther : Laxmi Toppo
	 * @Date: 22 dec 2022
	 */

package question2;

import java.util.Scanner;
//declaring class
public class PrimeNumber {
   //declaring main
	public static void main(String[] args) {
		
      Scanner sc=new Scanner(System.in);
      //take input
      System.out.println("Enter any number");
      int num=sc.nextInt();
     
  		int t = 0;//holds the count of values
  		//start for loop 
  		for(int i=2;i<=num-1;i++) {
  			if(num%i==0) {
  				t=t+1;
  			}
  		}
  		//the number is not prime.
  		if(t>0) {
  			System.out.println("This is not prime number:");
  		}
  		else {
  			System.out.println("This is  prime number:");

  		}//end forloop

	}//end main
}//end class
