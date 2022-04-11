package com.training.cg;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader fr=new FileReader("D:\\file.txt");
		try
		{
			int i=0;
			while((i=fr.read())!=-1)
				System.out.print((char)i);
			fr.close();
		}
		catch(FileNotFoundException f)
		{
			System.out.println(f);
		}
		//System.out.println();
		System.out.println(" Great Success...");
	}

}
