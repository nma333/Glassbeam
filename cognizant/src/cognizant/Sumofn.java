package cognizant;
import java.util.*;
public class Sumofn {
	
	public static void fib(int n) {
		int a=0,b=1,c=0;
		for(int i=0;i<n;i++) {
			
			System.out.println(a+" ");
			c=a+b;
			a=b;
			b=c;
			
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of series:");
		int n=sc.nextInt();
//		int  num=(n*(n+1))/2;
//		System.out.printf("%d\n",num);
//		
//		System.out.println(sums(n));
		fib(n);


	}

}
