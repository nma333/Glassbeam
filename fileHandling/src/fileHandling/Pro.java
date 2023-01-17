package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Pro {

	public static void main(String[] args) throws IOException {
		
		//FileOutputStream fos=new FileOutputStream(f);
		Properties p=new Properties();
		OutputStream os=new FileOutputStream("data.txt");
		p.setProperty("UserName","Naveen");
		p.setProperty("Password", "Naveen*333");
		p.setProperty("email", "naveenank2001@gmail.com");
		p.setProperty("Place", "Ilkal");
		p.store(os, null);
		
		//Printing the values
		InputStream is=new FileInputStream("data.txt");
		p.load(is);
		System.out.println(p.getProperty("UserName"));
		System.out.println(p.getProperty("email"));
		System.out.println(p.getProperty("Password"));
		System.out.println(p.get("Place"));

	}

}
