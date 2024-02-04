package testclasses;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("D:/MUSCAT_RLOS/Project/test.txt");
		
		if(file.createNewFile())
		{
			System.out.println("File created---->>>");
		}
		else
		{
			System.out.println("File already exists---->>>");
		}
		
		String path = file.getAbsolutePath();
		System.out.println("path--->>>"+path);
		
		FileWriter fw = new FileWriter(path,true);
		
		fw.write("Type Something---->>>");
		fw.write("\n");
		fw.write("name");
		fw.write("\n");
		fw.close();
		
		FileReader fr = new FileReader(path);	
		BufferedReader br = new BufferedReader(fr);
		//int i = fr.read();
		//System.out.println("read---->>>"+i);
		String data;
		char str[]  = new char[100];
		String output = "";
		while((data=br.readLine())!=null)
		{
			
			System.out.println("output--->>>"+data);
		}
		//System.out.println("output--->>>"+output);
		fr.close();
	}

}
