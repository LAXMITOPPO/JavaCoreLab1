/*
 * Inheritance
 * @auther : Laxmi Toppo
 * @Date: 24 nov 2022
 */
package com.ques2;
//declaring class
public class Parent {
	void A()
	{
		System.out.println("This is parent class...");//print base class
	}
}
	class child extends Parent{
		void B() 
		{
			System.out.println("This is child class...");//print subclass
		}
		
	}
		class Parent1 extends child{

			void C() 
			{
				System.out.println("This is child class...");//print sub class
			}
	}
	
	

