package com.training.cg;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try
		{FileWriter fw=new FileWriter("D:\\file.txt");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the text");
		String s=sc.nextLine();
		s=s.toUpperCase();
		fw.write(s);
		fw.close();
		sc.close();
		}
		catch(IOException e)
		
		{
			System.out.println(e);
		}
		System.out.println("Success");
	}

}
