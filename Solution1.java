package glassbeam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution1 {
	//This function accept the week day and returns the string which contains the name on the thieves who will carry the thefts.
	public static String thives(int num) {
		String res = null;
		if(num>0 && num<8) {
			if(num%3==0)
				res= "AE";
			else if(num%3==1)
				res= "EC";
			else if(num%3==2)
				res= "CA";
		}
		else 
			res= null;
		return res;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		//User input using the StringBuffer
		
		InputStreamReader in =new InputStreamReader(System.in);
		BufferedReader bf =new BufferedReader(in);
		System.out.println("Enter the week day :");
		
		//Converting the string into the int by using the functionalities of the Integer method.
		
		int n=Integer.parseInt(bf.readLine());
		String res=thives(n);
		if(res!=null)
			System.out.println(res.charAt(res.length()-2)+" and "+res.charAt(res.length()-1)+" will carrying out the thefts");
		else
			System.out.println("Please enter the valid day");
	}
}