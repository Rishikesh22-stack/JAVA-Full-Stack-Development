package com.simplilearn.filehandling;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class CreateNewFile {

	static void createFileUsingFileClass() throws IOException
	{
		File file=new File("D:\\Mphasis Training\\Phase-1\\Session 5\\text1.txt");
		
		//create the file
		if(file.createNewFile())
			System.out.println("File is created");
		else
			System.out.println("File already Exit");
		
		//write data to file
		
		FileWriter writer=new FileWriter(file);
		writer.write("Welcome to file handling");
		writer.close();
	}
	//create file using FileOutputStream
	static void createFileUsingOutputStream() throws IOException
	{
		FileOutputStream out=new FileOutputStream("PATH");
		String data="Welcome to the world JAVA File Handling";
		out.write(data.getBytes());
		out.close();
	}
	
	static void createFileUsingNIO() throws IOException{
		String data="Message";
		Files.write(Paths.get("D:\\\\Mphasis Training\\\\Phase-1\\\\Session 5\\\\text1.txt"),data.getBytes(),StandardOpenOption.CREATE);
		List<String> lines=Arrays.asList("This is my first line","This is my second line");
		Files.write(Paths.get("D:\\\\Mphasis Training\\\\Phase-1\\\\Session 5\\\\text2.txt"),lines,StandardOpenOption.CREATE,StandardOpenOption.APPEND);
	}
	public static void main(String[] args) {
		try {
			createFileUsingNIO();
		}
		catch(IOException  e)
		{
			System.out.println(e);
			
		}
}
}
