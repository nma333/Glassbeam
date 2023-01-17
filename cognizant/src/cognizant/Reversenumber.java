package cognizant;
import java.util.*;

public class Reversenumber {
	public static int reverse(int num) {
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		return rev;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the number to check palindrome:");
		int n=sc.nextInt();
		int rn=reverse(n);
		if(n==rn) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("NonPalindrome");
		}
		sc.close();

	}

}
