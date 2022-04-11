package com.test.cg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Initial JUNIT class")
public class ContactMgrTest {
	
	/*
	 * @Test public void shouldCreateContact(){ ContactManager cm = new
	 * ContactManager(); cm.addContact("Ram", "Prasad", "1234567489");
	 * 
	 * //assertFalse(cm.getAllContacts().isEmpty()); assertEquals(1,
	 * cm.getAllContacts().size()); System.out.println("Inside Test1");
	 * //assertTrue(cm.getAllContacts().isEmpty()); }
	 */
	
	/*
	 * @Test public void newTest() { System.out.println("Inside new Test"); int sum
	 * = 8+9; assertEquals(17, sum); }
	 */
	
	@BeforeAll  // This will run only once before all the tests
	public static void init() {
		System.out.println("This method will run first");
	}
	
	
	  @ParameterizedTest
	  @ValueSource(strings = {"rali", "teli", "malI"}) 
	  @Disabled
	  public void endsWithI(String str) { 
		  System.out.println("Running test"); 
		  assertTrue(str.endsWith("i") || str.endsWith("I")); 
	  }
	 
	
	@RepeatedTest(value=5)
	@DisplayName("Multiplication test")
	public void getSum() {
		System.out.println("Getting Sum....");
		int i = 7*5;
		assertEquals(35, i);
	}

}

// Annotations are directives to the compiler to handle that component in a specific way

