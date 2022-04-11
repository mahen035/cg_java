package com.training.cg;

import java.util.*;
public class Pattern {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input your choice:");
		int choice = sc.nextInt();
		int val = choice;
		for(int i = 5;i>0;i--) {
				if(val<=0) {
					System.out.print(" "+0);
				}
				else
				System.out.print(val-1+" ");
				val--;	
		}
	}

}
