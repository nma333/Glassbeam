package strings;
import java.io.*;

public class Bufferin {

	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader bf=new BufferedReader(is);
		System.out.println("Enter the number:");
		int n=Integer.parseInt(bf.readLine());
		System.out.println(n);
		
		System.out.println("Enter the name:");
		String name=bf.readLine();
		
		System.out.println("Enter the salary:");
		float salary=Float.parseFloat(bf.readLine());
//		System.out.println("Enter the name:");
//		String name=System.console().readLine();
//		System.out.println(name);
		
		

	}

}
