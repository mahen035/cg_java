package com.training.cg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class InheritanceDemo {

	public static void main(String[] args) {
		/*
		 * Cat cat1 = new Cat(); cat1.name = "doll"; cat1.type = "mammal"; cat1.age = 2;
		 * cat1.hairColor= "brown"; System.out.println(cat1.getInfo());
		 */
		
		Dog d1 = new Dog();  //Dog object is born
		
		d1.name = "tommy";
		d1.type = "Mammal";
		d1.age = 3;
		//d1.breed = "Pug";
		
		Dog d2 = new Dog();
		d2.name = "kite";
		d2.type = "Mammal";
		d2.age = 5;
		
		Dog d3 = new Dog();
		d3.name = "pups";
		d3.type = "Mammal";
		d3.age = 4;
				
		Dog d4 = new Dog();   // new object will be created with a distinct hashcode
		d4.name = "pups"; 
		d4.type = "Mammal";
		d4.age = 4;
		 
		
		Set<Dog> allDogs = new HashSet<Dog>();
		
		//Set<String> strings = new TreeSet<String>();
		
		List<String> strings = new LinkedList<String>();
		
		//Animal d1 = new Dog();
		
		Set<Integer> values = new HashSet<Integer>(); //Wrapper classes
		
		
				
		strings.add("Zebra");
		strings.add("Dog");
		strings.add("Cat");
		strings.add("Zebra");
		
		
		allDogs.add(d1);
		allDogs.add(d2);
		allDogs.add(d3);
		allDogs.add(d4);
		
		Map<String, Dog> myMap = new HashMap<String, Dog>();
		
		myMap.put(d1.name, d1);
		myMap.put(d2.name, d2);
		myMap.put(d3.name, d3);
		
		
		/*
		 * for(Map.Entry<String, Dog> entry : myMap.entrySet()) {
		 * System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue().age);
		 * 
		 * }
		 */
		//allDogs.add(d4);
		
		//Collections.sort(allDogs, new NameComparator());
				
		
		  for(Dog d:allDogs) { 
			  System.out.println(d.name+" Age:"+d.age);
		  }
		 
		
		/*
		 * for(String s:strings) { System.out.println(s); }
		 */
		
		/*
		 * Iterator<Dog> it = allDogs.iterator();
		 * 
		 * while(it.hasNext()) { System.out.println(it.next().getInfo()); }
		 */
		
		//System.out.println(d1.getInfo()); // Dyanamic polymorphism
		
		//d1.getInfo("pug"); // Static polymorphism

	}

}

// how to stop Set to add duplicate objects?

// Inheritance
// Method Overridding
// Parent class reference can point to a child class object
// Method overridding is an example of dynamic polymorphism.
// Method overloading is an example of static polymorphism.

// Create a Student class with fields like studId, studName, grade, studAddress

// Create at least 5 students sort them as per their grades and display them.
