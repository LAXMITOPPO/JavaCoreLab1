/*
 *do matrix multiplication
 * @Author :Laxmi Toppo
 * @Date :10 nov 2022
 */
//declaring package
package com.ques3;
//declaring class
public class matrix {
//start main
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating two matrices
		int x[][]= {{11,11,11},{2,2,2},{3,3,3}};
		int y[][]= {{1,1,1},{21,21,21},{3,3,3}};
		
		//create matrix to store the multiplications
		int c[][]=new int[3][3];
		//take variables
		int i,j,k;
		//multiplying and printing multiplication of two matrix
		//outer forloop
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++) 
			{
				c[i][j]=0;
				for(k=0;k<3;k++) 
				{
					c[i][j]+=x[i][k]*y[k][j];//multiplying process
				}
				System.out.print(c[i][j]+ " ");//printing the matrix
			}
			System.out.println();
		}//end outer forloop
	}//end main

}//end class
