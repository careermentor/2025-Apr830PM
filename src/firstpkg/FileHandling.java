package firstpkg;

import java.io.File;

import java.io.FileReader;
import java.util.Properties;

public class FileHandling {

	
	public static void readprop() throws Exception
	{
		FileReader fr = new FileReader("./TestData/first.properties");
		
		Properties prop = new Properties();
		
		prop.load(fr);
		
		System.out.println(prop.get("browser"));
		System.out.println(prop.get("url"));
		
	}
	
	public static void readdata() throws Exception {

		// File f = new File("C:\\TestData\\data.txt");

		File f = new File("./TestData/data.txt");

		FileReader fr = new FileReader(f);

		int r = fr.read();

		while (r != -1) 
		{
			System.out.print((char) r);
			r = fr.read();
		}

	}

	public static void main(String[] args) throws Exception {

		readprop();
	}
}
