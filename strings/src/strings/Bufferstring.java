package strings;

public class Bufferstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer  sb=new StringBuffer("Naveen");
		StringBuffer rsb=sb.reverse();
		if(sb.equals(rsb)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Non palindrome");
		}
		sb.deleteCharAt(2);
		System.out.println(sb);
		
		

	}

}
