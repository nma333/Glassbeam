package cognizant;

public class Evenoddnum {

	public static void main(String[] args) {
		int num=12345;
		int ecount=0;
		int ocount=0;
		
		while(num!=0) {
			int n=num%10;
			if(n%2==0) {
				ecount++;
			}
			else
				ocount++;
			num=num/10;
		}
		System.out.println(ecount+" "+ocount);
		

	}

}
