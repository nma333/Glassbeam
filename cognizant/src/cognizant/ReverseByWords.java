package cognizant;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseByWords {
	public static String rev(String str) {
		System.out.println("String length:" + str.length());
		String[] s = str.split(" ");
		String result = "";
		for (int i = 0; i < s.length; i++) {
			if (i == 0) {
				result = s[i] + result;
			} else {
				result = s[i] + " " + result;
			}

		}

		return result;
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(is);
		System.out.println("Enter the string:");
		String in = bf.readLine();
		String nr = rev(in);
		System.out.println(nr);

	}

}
