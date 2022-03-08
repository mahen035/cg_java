package com.training.cg;

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
		
		System.out.println(d1.getInfo()); // Dyanamic polymorphism
		
		d1.getInfo("pug"); // Static polymorphism

	}

}

// Inheritance
// Method Overridding
// Parent class reference can point to a child class object
// Method overridding is an example of dynamic polymorphism.
// Method overloading is an example of static polymorphism.
