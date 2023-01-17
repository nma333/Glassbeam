package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;


public class DuplicateCharacters {
	public static void rem(String str) {
		LinkedHashSet<Character> h=new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++) {
			if(h.contains(str.charAt(i))) {
				System.out.print(str.charAt(i)+" ");
			}
			else {
				h.add(str.charAt(i));
			}
		}
	}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader in =new InputStreamReader(System.in);
		BufferedReader bf=new BufferedReader(in);
		System.out.println("Enter the string:");
		String str=bf.readLine();
		rem(str);
		
		
	}

}
