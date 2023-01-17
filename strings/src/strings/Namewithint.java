package strings;

public class Namewithint {
	public static void name(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%c",arr[i]);
		}
		
	}
	public static void counts(String str) {
		int vcount=0;
		int ccount=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'|| str.charAt(i)=='b'||str.charAt(i)=='c'||str.charAt(i)=='d'||str.charAt(i)=='e') {
				vcount++;
				
			}
			else {
				ccount++;
			}
		}
		System.out.printf("In %s there are %d vowels and %d consonets.",str,vcount,ccount);
		
	}
	public static void compare(String name) {
//		String name="Naveen";
		String comp="";
		for(int i=0;i<name.length();i++) {
			comp=name.charAt(i)+comp;
		}
		if(name.equals(comp))
			System.out.println("Both strings are equal");
		else
			System.out.println("Not equal");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr= {78,65,86,69,69,78};
		//String str="Naveen Mahantesh Ankasadaddi";
		

	


	}

}
