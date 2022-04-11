package com.training.cg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {
	
	public static void main(String args[]) throws IOException {
		
		char[] arr = new char[100];
		File file = new File("C:\\Users\\Hewlett Packard\\Desktop\\CG\\test.txt");
		FileReader input=null;
		BufferedWriter output = null;
		BufferedReader br = null;
		try {
			
			
			FileWriter fw = new FileWriter(file);
			
			output = new BufferedWriter(fw);
			
			output.append("Updated");
			output.append(" ");
			output.append("New");
			output.close();
			input = new FileReader("C:\\Users\\Hewlett Packard\\Desktop\\CG\\test.txt");
			br = new BufferedReader(input);
		    br.lines().forEach(System.out::println);
			 
		
		//input.read(arr);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		finally {
			output.close();
			br.close();
			input.close();
		}
		
		
		//System.out.println("Reading the file:::");
		
		//System.out.println(arr);
		
		
		/*
		 * boolean val = false;
		 * 
		 * try { val = file.createNewFile(); } catch (IOException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 * 
		 * if(val) { System.out.println("File created successfully.."); } else {
		 * System.out.println("File creation failed..."); }
		 */
	}

}
