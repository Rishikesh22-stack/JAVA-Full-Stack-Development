package com.simplilearn.lock;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.*;

class MyFilenameFilter implements FilenameFilter {

	String initials;

	public MyFilenameFilter(String initials) {
		this.initials=initials;
		}
	public boolean accept(File dir, String name) {
		return name.startsWith(initials);
		}
}

public class Lockedme
{
	public static void listInAssending(){
			File folder=new File("D:\\Mphasis Training\\Phase-1\\Projects\\Lockedme.com\\NewFiles\\");
			if(folder.isDirectory())
			{
				File[] fileList=folder.listFiles();
				Arrays.sort(fileList);
				FileFilter fileFilter=new FileFilter()
				{
public boolean accept(File file)
{
	return !file.isDirectory();
	}
};
Arrays.sort(fileList,new Comparator(){

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return((File)o1).getName().compareTo(((File)o2).getName());
		}
	});
for(File file:fileList)
{
	System.out.println(file.getName());
	}
}
}
	public static void main(String[] args)
	{
		boolean a=true;
		while(a)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("1. for getting file list");
			System.out.println("2. for bussiness operations");
			System.out.println("3. for close application");
			int option=sc.nextInt();
			if(option==1)
			{
				System.out.println("eneter location");
				String location=sc.next();
				listInAssending();
				}
			else if(option==2)
			{boolean t=true;
			while(t)
			{
				
				System.out.println("1. for add file");
				System.out.println("2. delete file");
				System.out.println("3. search file");
				System.out.println("4. go back");
				int b=sc.nextInt();
				if(b==1)
				{
					System.out.println("enter file name");
					String filename=sc.next();
					String conc="D:\\Mphasis Training\\Phase-1\\Projects\\Lockedme.com\\NewFiles\\"+filename;
					File file=new File(conc);
					boolean result;
					try
					{
						result=file.createNewFile();
						if(result)
						{
							System.out.println("file created"+file.getCanonicalPath());
							}
						else
						{
							System.out.println("file already exist at location"+file.getCanonicalPath());
							}
						}
					catch (Exception e)
					{
						// TODO: handle exception
						}
					}
				else if(b==2)
				{
					
					System.out.println("Files presnt in system");
					File file=new File("D:\\Mphasis Training\\Phase-1\\Projects\\Lockedme.com\\NewFiles\\");
					String[] fileList=file.list();
					for(String str: fileList)
					{
						System.out.println(str);
						}
					System.out.println("enter file name to delete");
					String filedelete=sc.next();
					String delete="D:\\Mphasis Training\\Phase-1\\Projects\\Lockedme.com\\NewFiles\\"+filedelete;
					Path path=FileSystems.getDefault().getPath(delete);
					try
					{
						Files.delete(path);
						}
					catch (NoSuchFileException e)
					{
						// TODO Auto-generated catch block
						System.err.format("%s: no such"+ "file or directory%n",path);
						}
					catch(IOException e)
					{
						System.err.print(e);
						}
					}
				
				else if(b==3)
				{
					
					File diretory=new File("D:\\Mphasis Training\\Phase-1\\Projects\\Lockedme.com\\NewFiles\\");
					System.out.println("Eneter file name");
					String search=sc.next();
					MyFilenameFilter filter=new MyFilenameFilter(search);
					String[] flist=diretory.list(filter);
					if(flist == null)
					{
						System.out.println("file not found");
						}
					else
					{
						for(int i=0;i<flist.length;i++)
						{
							System.out.println(flist[i]+" found");
							}
						}
					}
				else if(b==4)
					
				{
					t=false;
					}
				else
				{
					System.out.println("kindly enter correct option");
					}
				}
			}
			else if(option==3)
			{
				System.exit(0);
				}
			else
			{
				System.out.println("kindly enter correct option");
				}
			
			}
	}
}