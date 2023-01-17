package strings;

import java.util.Arrays;

public class SNcon {
	public static void rem(String in) {
		StringBuffer s=new StringBuffer(in);
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)<48 || s.charAt(i)>57) {
				s.deleteCharAt(i);
				i--;
			}else {
					continue;
			}
		}
		System.out.println(s);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		long num=12345;
//		String snum=Long.toString(num);
//		String snum="809535vbgfg32uiujh96";
//		rem(snum);
//		String[] words= {"Naveen","Apple","Cat","Dog"};
//		Arrays.sort(words);
//		for(int i=0;i<words.length;i++)
//			System.out.print(words[i]+" ");
		int num=1234;
		String s=Integer.toString(num);
		char arr[]=s.toCharArray();
		int arr1[]=new int[10];
		int count=0;
		if(arr.length%2==0) {
			for(int i=0;i<=arr.length/2;i=i+2) {
				
				for(int j=arr.length-1;j>=arr.length/2;j=j-2) {
					
					char n=(char) (arr[i]+arr[j]);
					int n1=Character.getNumericValue(n);

					arr1[count]=n1;
					n=0;
					n1=0;
					count++;
//					i=i+1;
//					//j=j-1;
					
					
				}
			}
			
		}
		else {
			
			
			
		}

		

		for(int i=0;i<count;i++) {
			System.out.println(arr1[i]);
		}
		
	}

}
