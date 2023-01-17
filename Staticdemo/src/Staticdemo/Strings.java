package Staticdemo;
import java.lang.String;
import java.util.Arrays;

public class Strings {

	public static void main(String[] args) {
		String str="    Naveen";
		System.out.println(str.concat("  Ankasadaddi"));
		System.out.println(str.strip());
		System.out.println(str.contains("Na"));
		System.out.println(str.endsWith("t"));
		str=str.strip();
		
		char arr[]=str.toCharArray();
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%s\t",arr[i]);
		}
		

	}

}
