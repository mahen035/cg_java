package com.training.cg;

public class Animal {
	
	String name;
	String type;
	int age;
	
	
	
	  public String getInfo() { return name+ " is a "+type +" who is " +age
	  +" years old"; }
	  
	  public int getNumber(int a) {
		  try {
			  return a/0;
		  }
		  catch(Exception e) {
			  System.out.println("Exception occured");
			  return -1;
		  }
	  }
	 
	 

}

//create a Dog class that will extend from Animal which will also have 
// getInfo method and then get Dog info by calling it's method
