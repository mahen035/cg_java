package com.training.cg;

public class Dog extends Animal {
	
	String breed= "bulldog";
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Dog) {
			Dog d = (Dog)obj;
			return (d.name.equals(this.name) && d.age==this.age && d.type.equals(this.type));
		}
		else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		int hash = 0;
		hash = age*20;
		//hash+=name.hashCode();
		return hash;
	}
	
	  @Override 
	  public String getInfo() { 
		  String str =  breed+ " is a "+type +" who is "
				  +age +" years old";
		 return super.getInfo() + str;
	   }
	  
	  //Method overloading
	  public String getInfo(String name) {
		  
		  return name +" Overloading demo";
		  }

			/*
			 * @Override public int compareTo(Dog o) {
			 * 
			 * if(this.age>o.age) { return 1; } else if(this.age < o.age) { return -1; }
			 * else { return 0; } //return this.name.compareTo(o.name);
			 * 
			 * }
			 */

}

// Comparable interface : has a compareTo() method
// Comparator interface has compare() method 