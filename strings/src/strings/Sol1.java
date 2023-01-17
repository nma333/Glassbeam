package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Sol1 {
	public static void s(String str,String ref) {
		LinkedHashMap<Character, Integer> lh=new LinkedHashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++) {
			Integer c=0;
			for(int j=0;j<ref.length();j++) {
				if(str.charAt(i)==ref.charAt(i)) {
					c++;
					lh.put(ref.charAt(i), c);
				}
					
			}
		}
		for(Map.Entry<Character, Integer> h:lh.entrySet()) {
			System.out.print(h.getKey());
			System.out.print(h.getValue());
			
		}
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader bf=new BufferedReader(in);
		System.out.println("Enter the string:");
		String str=bf.readLine();
		System.out.println("Enter the refference string");
		String refference=bf.readLine();
		s(str,refference);

	}

}
