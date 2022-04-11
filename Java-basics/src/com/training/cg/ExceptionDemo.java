package com.training.cg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExceptionDemo {
	
	public static void main(String args[]) throws MyException{
		
		
		/*
		 * int[] numbers = new int[4]; //numbers.length = 4
		 * 
		 * for(int i =0;i<=numbers.length;i++) { //0, 1, 2 ,3
		 * System.out.println(numbers[i]); //numbers[4] }
		 */
		
			int age = 5;
			
			String[] grades = {"A","B","C","D"};
			
			List<String> gradeList = new ArrayList<String>();
			
			gradeList = Arrays.asList(grades);
			
			for(String str:gradeList) {
				if(!str.equals("A")||!str.equals("B")) {
					throw new MyException("Invalid grade");
				}
			}
					
		
			//Animal a1 = new Animal();
		
			//a1.getNumber(5);
			
			if(age<18) {
				throw new MyException("Not Eligible to vote");
			}
		
			System.out.println("Exception occurred..");
		
		System.out.println("Display array values::End");
	}

}

// when someone tries to put a grade value other than [A, B, C, D], [1,2,3,4]
// then throw a custom exception which will display a message: "Grade value not allowed"
