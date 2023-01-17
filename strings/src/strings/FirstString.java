package strings;

public class FirstString {

	public static void splitword(String str) {
		String[] arr=str.split(" ");
		for(int i=0;i<arr.length;i++) {
			String s=arr[i];
			System.out.print(s.charAt(0)+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Name:"Naveen Mahantesh Ankasadaddi"
		//output="NMA"
		
		String name="Naveen Mahantesh Ankasadaddi";
		splitword(name);

	}

}
