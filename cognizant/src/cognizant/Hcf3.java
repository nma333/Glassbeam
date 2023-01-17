package cognizant;

public class Hcf3 {
	public static int hcf3(int a,int b,int c) {
		int h=1;
		int min;
		if(a<b && a<c)
			min=a;
		else if(b<a && b<c)
			min=b;
		else
			min=c;
		
		for(int i=2;i<min;i++) {
			if(a%i==0 && b%i==0 && c%i==0) {
				h=h*i;
			}
		}
		return h;
	}
	
	public static int lcm3(int a,int b,int c,int hcf) {
		int lc=0;
		
		return lc;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
