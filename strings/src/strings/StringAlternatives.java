package strings;

public class StringAlternatives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Naveen";
		String str2="Virat Ankasadaddi";
		StringBuffer result=new StringBuffer();
		
		if(str1.length()>str2.length()) {
			for(int i=0;i<str1.length() || i<str2.length();i++) {
				if(i<str1.length()) {
					result.append(str1.charAt(i));
				}
				if(i<str2.length()) {
					result.append(str2.charAt(i));
				}
			}
			
		}
		else {
			for(int i=0;i<str1.length() || i<str2.length();i++) {
				if(i<str2.length()) {
					result.append(str2.charAt(i));
				}
				if(i<str1.length()) {
					result.append(str1.charAt(i));
				}
			}
			
		}
		System.out.println(result);

	}

}
