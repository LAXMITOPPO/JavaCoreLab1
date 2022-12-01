package ques1;
import java.util.*;
public class color {
	public static void main(String[] args) {
		class Light implements Runnable{
			public  void run() {
				while(true) {
					System.out.println("light : RED");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("light : GREEN");
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("light : YELLOW");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
	}

	}
        Thread t1= new Thread(new Light(),"t1");
        t1.start();
	}}
		