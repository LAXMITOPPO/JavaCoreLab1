/*
 * Inheritance
 * @auther : Laxmi Toppo
 * @Date: 24 nov 2022
 */
package com.ques3;
import java.util.*;
//declaring class
//child class
public class Manager extends Employee{

	private List<Employee>Subordinates;
	public List<Employee>Subordinates() {
		return Subordinates;
	}
	
	public void setSubordinates(List<Employee>Subordinates) {
		this.Subordinates=Subordinates;
	}
	@Override
	public String toString() {
		return "Manager [Subordinates=" + Subordinates + ",details="+super.toString()+"]";
	}//end main
	
}//end class
