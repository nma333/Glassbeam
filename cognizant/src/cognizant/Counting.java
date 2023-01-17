package cognizant;
import java.util.*;

public class Counting {
	public static void count(int num) {
		int counts=0;
		while(num>0) {
			num=num/10;
			counts++;
			
		}
		System.out.println(counts);

		
	}
	public static void main(String[] args) {
		int num=109898;
		count(num);

		
		

	}

}
