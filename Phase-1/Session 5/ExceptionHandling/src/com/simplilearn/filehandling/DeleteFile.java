package com.simplilearn.filehandling;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class DeleteFile {
	
	public static void main(String[] args) {
		
		try {
			Files.deleteIfExists(Paths.get("D:\\\\Mphasis Training\\\\Phase-1\\\\Session 5\\\\text1.txt"));
		}catch(NoSuchFileException e) {
			System.out.println(e);
		}
		catch (DirectoryNotEmptyException e) {
			System.out.println("Directory is not Empty");
		}
		catch (IOException e) {
			System.out.println("IOException "+e);
		}
		System.out.println("Deletion Successfull");
	}

}
