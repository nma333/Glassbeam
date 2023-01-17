package cognizant;

public class ReverseString {
	public static String revstring1(String str) {
		String rv="";
		for(int i=0;i<str.length();i++) {
			rv=str.charAt(i)+rv;
		}
		return rv;
	}
	
	public static StringBuilder revestring2(String str) {
		StringBuilder sb=new StringBuilder("Naveen");
		return sb.reverse();
		
	}
	public static void main(String[] args) {
		String str="Naveen";
		System.out.println(revstring1(str));

	}

}
