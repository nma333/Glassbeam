import java.util.*;

public class Fibonacci {
	public static void fib(int n) {
		int a=0,b=1,c;
		for(int i=0;i<n;i++) {
			System.out.printf("%d\t",a);
			c=a+b;
			a=b;
			b=c;
			
		}
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Eneter the number of fibonacci series to print:");
		Scanner sc=new Scanner(System.in);
		int n=5;
		fib(n);
		sc.close();

	}

}
