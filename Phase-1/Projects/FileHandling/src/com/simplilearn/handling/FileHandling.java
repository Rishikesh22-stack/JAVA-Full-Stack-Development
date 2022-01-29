package com.simplilearn.handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
		
		try {
			String data="Welcome To Filehandling";
			File f1= new File("D:\\Mphasis Training\\Phase-1\\Projects\\FileHandling\\src\\com\\simplilearn\\abc.txt");
			if(!f1.exists()) {
				f1.createNewFile();
			}
			
			FileWriter fileWriter = new FileWriter(f1.getName(),true);
			BufferedWriter bw = new BufferedWriter(fileWriter);
			bw.write(data);
			bw.close();
			System.out.println("Done");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
