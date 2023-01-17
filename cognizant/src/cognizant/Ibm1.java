package cognizant;
import java.util.*;

public class Ibm1 {
	


	public static StringBuffer name(StringBuffer in) {
		
		StringBuffer sb=new StringBuffer(in);
		System.out.println(sb);
		char i=in.charAt(0);
		char j=in.charAt(1);
		in.deleteCharAt(0);
		in.deleteCharAt(0);
		in.append(i);
		in.append(j);
		System.out.println(in);
		return sb;
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

	}

}
