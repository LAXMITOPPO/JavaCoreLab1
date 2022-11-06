/*
 *Daimond pattern
 * @Author :Laxmi Toppo
 * @Date :3 nov 2022
 */
//declaring package
package com.ques1;
//declaring class
public class Daimond {

	void printpattern(int n) {
		//take variables
		int i,j,k;
		
		//outer forloop
		for( i=1;i<=n; i++) {
			//inner forloop for space
			for(j=1;j<=n-i; j++) {
				System.out.print(" ");
			}//end inner forloop
			
			//loop for print star
			for(k=1;k<=i*2-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}//end first loop
		
		//reverse for down pattern
		for( i=n-1;i>=1; i--){
			
			//inner forloop for space
			for(j=1;j<=n-i; j++) {
				System.out.print(" ");
			}//end inner forloop
			
			//loop for print star
			for(k=1;k<=i*2-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}//end second loop
		
	}//end printpattern

}//end class
