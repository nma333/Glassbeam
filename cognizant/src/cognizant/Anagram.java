package cognizant;

//import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
	public static void Anagram(String str1, String str2) {

		if (str1.length() == str2.length()) {
			char[] Str1 = str1.toCharArray();
			char[] Str2 = str2.toCharArray();

			Arrays.sort(Str1);
			Arrays.sort(Str2);

			boolean result = Arrays.equals(Str1, Str2);
			if (result) {
				System.out.printf("String are Anagram");

			} else {
				System.out.printf("String are not Anagram");
			}

		} else {
			System.out.println("Both the arrays are not matching and of different length");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "race";
		str1 = str1.toLowerCase();
		String str2 = "Acer";
		str2 = str2.toLowerCase();
//		int num[]= {2,9,1,20,8,6};
//		Arrays.sort(num);
//		
//		char Str[]= {'N','n','u','a','P'};
//		Arrays.sort(Str);
//		
//		for(int i=0;i<num.length;i++) {
//			System.out.printf("%d\t", num[i]);
//		}
//		System.out.println();
//		for(int i=0;i<Str.length;i++) {
//			System.out.printf("%s\t", Str[i]);
//		}
		Anagram(str1, str2);

	}

}
