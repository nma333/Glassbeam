package cognizant;

public class TouppertoLower {
	
	public static void function(String str) {
		String upper="";
		String lower="";
		int mid=str.length()/2;
		
		for(int i=0;i<str.length();i++) {
			if(i<mid) {
				upper=upper+Character.toUpperCase(str.charAt(i));
			}
			else {
				lower=lower+Character.toLowerCase(str.charAt(i));
			}
		}
		
		System.out.println(upper +" " + lower);
	}
	public static void main(String[] args) {
		String str="naveen Mahantesh";
		function(str);
	}
}
