package cognizant;
public class Hcf {
	
	public static int hcf(int a,int b) {
		int h=1;
		for(int i=2;i<Math.min(a, b);i++) {
			if(a%i==0 && b%i==0) 
				h=h*i;
			else
				continue;
		}
		return h;
	}
	
	public static int lcm(int a,int b,int hcf) {
		int lc=(a*b)/hcf;
		return lc;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20,c;
		c=hcf(a,b);
		int d=lcm(a,b,c);
		System.out.printf("HCF of %d and %d is %d and LCM is %d",a,b,c,d);

	}

}
