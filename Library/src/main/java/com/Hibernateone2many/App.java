package com.Hibernateone2many;

import java.util.Scanner;

import LibraryMethod.Create;
import LibraryMethod.Retrieve;
import LibraryMethod.Update;

/**
 * Hello world!
 *
 */
public class App {
	static void menu() {
		System.out.println("Select any option from the menu:");
		System.out.println("1.insert");
		System.out.println("2.retrive");
		System.out.println("3.Update");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------Library-----------");
		System.out.println("Enter username");
		String nm = sc.next();
		System.out.println("Enter password");
		String ps = sc.next();
		System.out.println(".........login success......");

		menu();
		int choice;
		System.out.println("Enter your choice:");
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			Create c = new Create();
			c.create();
			break;
		case 2:
			Retrieve r = new Retrieve();
			r.retrieve();
			break;
		case 3:
			Update u = new Update();
			u.update();
			break;
		default:
			System.out.println("wrong choice.....");
		}
	}
}
