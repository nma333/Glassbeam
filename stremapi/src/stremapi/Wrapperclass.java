package stremapi;

import java.util.Scanner;

public class Wrapperclass {

	public static void main(String[] args) {
		int n=200;
		//Autoboxing
		Integer num=Integer.valueOf(n);
		System.out.println(n + " "+ num);
		//Unboxing
		int number=num.intValue();
		
		
		char c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character value:");
		//c=sc.next().charAt(0);
		//System.out.println(c);
		
		System.out.println(n +" is "+((Object)n).getClass().getSimpleName());
		
		//System.out.println(c+" is "+((Object)c).getClass().getSimpleName());
		
		byte b=-29;
		System.out.println(b +" is "+((Object)b).getClass().getSimpleName());
		
		short s=-128;
		System.out.println(s+" is "+((Object)s).getClass().getSimpleName());
		
		sc.close();
		
		boolean ss=true;
		System.out.println(ss +" is " +((Object)ss).getClass().getSimpleName());
	}

}
