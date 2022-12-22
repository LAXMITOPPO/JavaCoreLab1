/*
	 * Inheritance
	 * @auther : Laxmi Toppo
	 * @Date: 22 dec 2022
	 */
package LabTest22dec2022;
//declaring class
public class Employee {
	
			private String name;
			private int age;
			private int phoneno;
			private String address;
			private double salary;

	 void MemberDetails(String mname,int mage,int mphn,String madd,double msal) {
		 String name=mname;
		int  age=mage;
		int  phoneno=mphn;
		String address=madd;
		double salary=msal;
	 }

	 void MemberDisplay() {
		 
	 }
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge( int age) {
		this.age = age;
	}

	public int getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", phoneno=" + phoneno + ","
				+ " address=" + address + ", salary="+ salary + "]";
	}
	 
	}//end class

