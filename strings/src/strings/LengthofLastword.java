package strings;

public class LengthofLastword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Naveen Mahantesh Ankasadaddi";
		String arr[]=str.split(" ");
		String word=arr[arr.length-1];
		System.out.println(word.length());
	}

}
