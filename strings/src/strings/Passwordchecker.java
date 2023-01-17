package strings;

import java.util.Arrays;
import java.util.HashSet;

public class Passwordchecker {
	public static boolean checker(String in) {
		boolean res=false;
		boolean sn=false;
		boolean sU=false;
		boolean sl=false;
		boolean sc=false;
		boolean sp=false;
		HashSet<Character> symbols=new HashSet<Character>(Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                '*', '(', ')', '-', '+'));
		for(char i:in.toCharArray()) {
			if(Character.isUpperCase(i)) 
				sU=true;
			if(Character.isLowerCase(i))
				sl=true;
			if(Character.isDigit(i))
				sn=true;
			if(Character.isSpace(i))
				sp=true;
			if(symbols.contains(i))
				sp=true;
		}
		if(sn && sU && sl && sc && sp)
			res=true;
		else
			res=false;
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checker("Naveen Mahantesh Ankasdadddi*33"));

	}

}
