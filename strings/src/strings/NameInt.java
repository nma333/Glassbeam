package strings;

public class NameInt {

	public static void main(String[] args) {
		int arr[]=new int[] {78,65,86,69,69,78};
		int add[]=new int[] {65,78,75,65,83,65,68,65,68,68,73};
		for(int i=0;i<arr.length;i++) {
			System.out.print((char)arr[i]);
		}
		System.out.print(" ");
		for(int i=0;i<add.length;i++) {
			System.out.print((char)add[i]);
		}
	}
}