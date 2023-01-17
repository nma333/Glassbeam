package cognizant;
import java.text.*;

public class Armstrong {
	public static void arm(int n) {
		int sum=0;
		int d=n;
		int digits=0;
		while(n>0) {
			n=n/10;
			digits++;
			
		}
		while(n!=0) {
			int r=n%10;
			sum=sum+(int)(Math.pow(r, digits));
			n=n/10;
			
		}
		if(sum==d) {
			System.out.println("Armstrong");
		}
			
		else {
			System.out.println("Not Armstrong");
		}
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=11;
		arm(num);
			

	}

}
