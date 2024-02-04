package testclasses;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileOperationsGettingCounts {
	
	public static void main(String args[]) throws IOException
	{
		File file = new File("D:/MUSCAT_RLOS/Project/test.txt");
		String filepath = file.getAbsolutePath();
		
		System.out.println("File path-->>"+filepath);
		
		FileReader fr = new FileReader(filepath);
		BufferedReader br  = new BufferedReader(fr);
		
		String data;
		int count = 0;
		List<String> filecontent = new ArrayList<String>();
		int nofwords=0;
		int nofletters = 0;
		
		while((data=br.readLine())!=null)
		{
			//System.out.println(data);
			String str[] = data.split(" ");
			filecontent.add(data);
			nofwords = nofwords+str.length;
			
			for(int i=0;i<str.length;i++)
			{
				nofletters = nofletters + str[i].length();
			}
			//char ch []  = data.toCharArray();
			count++;
		}
		System.out.println("Number of lines-->>"+count);
		System.out.println("Number of words-->>"+nofwords);
		System.out.println("Number of characters-->>"+nofletters);
		System.out.println("File content-->>"+filecontent);
		
		
	}

}
