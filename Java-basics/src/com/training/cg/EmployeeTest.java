package com.training.cg;

public class EmployeeTest {
	
	public static void main(String a[]) {
		Employee emp1 = new Employee();  //Constructor call
		
		emp1.setEmpId("101_IN");
		
		emp1.setEmpSalary(21000);
		
		Employee.organization = "CapGemini";
		
		System.out.println(emp1.getEmpId());
		
		System.out.println(emp1.getEmpSalary());
			
	}
	
	static {
		System.out.println("We are inside the static block after main..");
	}

}

// How to create Java bean class?
// Why attributes or variable should be declared as private?
// how to create an object of a class and access its data through the methods?
// What is constructor and what is default constructor?
// Use of this keyword
// static members
// why main method is static?

// CONVENTIONS:
//1. Class name should always be capitalized
//2. the variable name/method name should be camel-cased (employeeAge)
//3. final variable name should be in all caps (WEEKDAY)

//String literals and String objects

//////////HANDS ON//////////////
// Create a product java bean with fields like prodId, prodName, prodDesc and price
// Create getters and setters for these fields
// create at least 5 products 
// Display details of most costly product.
// Makes sure you follow all java naming conventions


//Abstract Class:-- If a method is having only declaration and no definition then that 
// method is called abstract method