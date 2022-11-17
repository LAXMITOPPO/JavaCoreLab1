package com.ques2;

import java.util.Scanner;

public class CommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       int[] arr1=new int[10];
       int[] arr2=new int[10];
       int i,j;
		Scanner sc=new Scanner(System.in);

		System.out.println("enter  elements for first array");
		for(i=0;i<5;i++) 
		{
			arr1[i] =sc.nextInt();
			
		}
		System.out.println("enter  elements for second array");
		for(i=0;i<5;i++)
		{
			arr2[i] =sc.nextInt();
			
		}
		System.out.println("common elements are:");
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				if(arr1[i]==arr2[j])
					System.out.print(arr1[i]+ " ");
			}
		}
		
		sc.close();

	}

	

}
