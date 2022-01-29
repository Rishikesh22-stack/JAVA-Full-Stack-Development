package com.simplilearn.filehandling;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReadFile {

	public static List<String> readFile(String fileName)
	{
		List<String> list= Collections.emptyList();
		try {
			list=Files.readAllLines(Paths.get(fileName),StandardCharsets.UTF_8);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static void main(String[] args) {
		List<String> result =readFile("D:\\\\Mphasis Training\\\\Phase-1\\\\Session 5\\\\text1.txt");
		
		Iterator<String> it=result.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
