package com.ques4;

import java.util.Scanner;

public class studentRank {
	String name;
	float marks;
	
	public void studentRank (String name,float marks){
		this.name= name;
		this.marks= marks;
	}

  
(studentRank[] st) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		for(int i=0;i< st.length;i++) {	
			System.out.println("enter name"+(i+1));
			String name=sc.nextLine();
			System.out.println("enter name"+(i+1));
			Float marks=sc.nextFloat();
			st[i]=new studentRank();
			
		}
		sc.close();

		}
	

}
