
//Java 8 Changes
// 1. Lambda Expression
// 2. Functional interface
// 3. Streams
package com.training.cg;

import java.util.function.Predicate;

public class LambdaDemo {
	
	public static void main(String args[]) {
		//Addition add = new Addition();
		/*
		 * DemoInterface d =(a) -> { for(int i = 0;i<a.length;i++) {
		 * System.out.println("num is :"+a[i]); }
		 * 
		 * }; int[] num = {2,5,4,7}; d.show(num);
		 */
		//d.show(30,80);
		
		Predicate<Integer> p = (b) -> {
			if(b > 5) {
				return true;
			}
			else {
				return false;
			}
		};
		
		boolean pass = p.test(4);
		System.out.println(pass);
	}
	
	// Function, Consumer, Supplier

}
/*
 * public void show() { System.out.println("Dummy"); }
 */

// Write a lambda expression to calculate average of 3 numbers

// pass an array of int and calculate the average value of all the elements
