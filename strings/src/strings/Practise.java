package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practise {
	public static int rec(int num){
//		int res=1;
		if(num==0)
			return 1;
		else if(num==1)
			return 1;
		else
			return num*rec(num-1);
		
		
	}
	
	public static void fib() throws NumberFormatException, IOException {
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader bf=new BufferedReader(in);
		int a=0,b=1,c;
		System.out.println("Enter the number of series:");
		int n=Integer.parseInt(bf.readLine());
		System.out.println("Fibbonacci series upto "+n+ "is :");
		for(int i=0;i<n;i++) {
			System.out.println(a);
			
			c=a+b;
			a=b;
			b=c;
		}
		
	}
	

	public static void main(String[] args) throws NumberFormatException, IOException {
//		String pass="Naveen1";
//		StringBuffer n=new StringBuffer(pass);
//		int nc=0;
//		for(int i=0;i<pass.length();i++) {
//			for(int j=i+1;j<pass.length();j++) {
//				System.out.println(pass.substring(i, j));
//			}
//			
//
//	}	
		
		int a=10;
		int b=20;
		int c;
		//System.out.println("Before swaping a="+a+"b="+b);
		a=a*b;
		b=a/b;
		a=a/b;
		//System.out.println("After swaping a="+a+"b="+b);
		//System.out.println(rec(5));
		fib();
	}
}
