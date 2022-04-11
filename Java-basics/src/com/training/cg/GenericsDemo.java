package com.training.cg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericsDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>(); //Generics is used for type safety for your collection
		
		list.add(2);
		//list.add("Hello");
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			int i = it.next();
			System.out.println(it.next());
		}

	}

}
