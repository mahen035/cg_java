package com.training.cg;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Ramesh","John","Rohan","Kevin","Sara");
		
		
		
		//stream.filter(odd -> odd%2!=0)
				//.forEach(System.out::println); //method Reference
		
		//stream1.sorted().forEach(System.out::println);
		
		//boolean val = stream1.noneMatch(s->s.startsWith("K"));
		
		//System.out.println(val);
		
		List<Integer> num = Arrays.asList(6,8,4,3,1);
		
		//Stream<Integer> stream = num.stream();
		
		Stream<Integer> stream1 = num.stream();
		
		Optional<Integer> newString = stream1.reduce((a,b) -> a+b);
		
		newString.ifPresent(System.out::println);
		
		// Calculate sum of all even numbers from a list using stream
		
		
		
		//List<Integer> squareValues = stream1.map(i -> i*i).collect(Collectors.toList());
		
		//stream1.map(i -> i*i).forEach(System.out::println);
		/*
		 * System.out.println("------------"); for(int a: num) { System.out.println(a);
		 * }
		 */
		
		//.out.println("Total Empty Strings are: "+counter);
		
		
	}
	
	//Intermediate operation
	//Terminal operation
	
	// take a list of integers and filter out all the odd number
	
	

}
