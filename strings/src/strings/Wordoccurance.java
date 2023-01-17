package strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Wordoccurance {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader bf=new BufferedReader(is);
		System.out.println("Enter the line:");
		String in=bf.readLine();
		String arr[]=in.split(" ");
		System.out.println("Enter the word to check:");
		String c=(String)bf.readLine();
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals(c)) {
				count++;
			}
		}
		System.out.printf("Repeted %d times",count);
		

	}

}
