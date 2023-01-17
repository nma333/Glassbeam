package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coronanames {
	public static void fib(int num) {
		int a=0,b=1,c;
		int i;
		for(i=0;i<num;i++) {
			System.out.printf("%d\t",a);
			c=a+b;
			a=b;
			b=c;
			
		}
	}

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
//		InputStreamReader in=new InputStreamReader(System.in);
//		BufferedReader bf=new BufferedReader(in);
//		int num=Integer.parseInt(bf.readLine());
		int num=6;
//		fib(num);
		System.out.println(num&2);
	}

}
