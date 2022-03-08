package com.training.cg;

public class Dog extends Animal {
	
	String breed= "bulldog";
	
	
	  @Override public String getInfo() { 
		  String str =  breed+ " is a "+type +" who is "
				  +age +" years old";
		 return super.getInfo() + str;
	   }
	  
	  //Method overloading
	  public String getInfo(String name) {
		  
		  return name +" Overloading demo";
		  }

}
