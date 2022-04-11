package com.training.cg;

public class StringDemo {

	public static void main(String[] args) {
		
		String str1 = "example";   //Strings are immutable
		String str2 = "examz";
		
		StringBuilder sb = new StringBuilder("hi"); // It is not synchronized
	
		
		
		StringBuffer buffer = new StringBuffer("Welcome "); //It is synchronized
		
		// substring, replace, indexOf, delete, charAt
		
		buffer.append("Home");
		
		System.out.println(buffer);
		
		sb.append("Hello");
		
		System.out.println(sb);
		
		//String str3 = str1.concat(str2);
		
		//System.out.println(str3);
		
		//System.out.println("Compare: "+str1.compareTo(str2));
		
		//String str3 = new String("example");
		//String str4 = new String("example");
		
		//System.out.println(str1.equals(str2));//equals method compares the contents
		
		//System.out.println(str1 == str2); // compare whether the references are pointing to same object
		//
		//System.out.println(str3.equals(str4));
		//System.out.println(str3 == str2);

	}

}
