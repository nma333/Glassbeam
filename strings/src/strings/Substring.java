package strings;

import java.util.HashMap;

public class Substring {
	
	public static void occurance(String in) {
		HashMap<Character, Integer> h=new HashMap<Character,Integer>();
		Integer j=1;
		
		for(int i=0;i<in.length();i++) {
			if(h.containsKey(in.charAt(i))) {
				j++;
				h.put(in.charAt(i), j);
			}
			else {
				j=1;
				h.put(in.charAt(i), j);
			}
		}
		System.out.println(h);
	}
	public static int fib(int num) {
		if(num<0)
			return 1;
		else if(num==0)
			return 1;
		else
			return num*fib(num-1);
	}
	public static void cog(String in) {
		int len=in.length();
		int d=2;
		if(len%d==0) {
			for(int i=0;i<in.length();i=i+d) {
				System.out.println(in.substring(i, i+d));
			}
			
		}else {
			System.out.println("Cnnot be divided");
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Naveen Ankasadaddi";
//		for(int i=0;i<name.length();i++) {
//			for(int j=i+1;j<name.length();j++) {
//				//System.out.println(name.substring(i, j));
//			}
//		}
		occurance(name);
		System.out.println(fib(6));
		cog(name);

	}

}
