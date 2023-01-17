package cognizant;
import java.util.*;


public class Vowelcount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the string");
		String in=sc.next();
		sc.close();
		int len=in.length();
		in=in.toLowerCase();
		int vcount=0;
		int ccount=0;
		for(int i=0;i<len;i++) {
			if(in.charAt(i)=='a' ||in.charAt(i)=='e' ||in.charAt(i)=='i' ||in.charAt(i)=='o' || in.charAt(i)=='u') {
				vcount++;
			}
			else {
				ccount++;
			}
		}
		System.out.println("Number of vowels in the string :"+vcount);
		System.out.println("Number of consonents in the string :"+ccount);
		

	}

}
