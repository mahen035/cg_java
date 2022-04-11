package com.training.cg;

import java.io.*;
import java.util.*;
public class FileCreation {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("D:\\file.txt");
		boolean result;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the content of the file");
		String s=sc.nextLine();
		byte b[]=s.getBytes();
		try {
			fos.write(b);
			fos.close();
			System.out.println("Great Success...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}

}