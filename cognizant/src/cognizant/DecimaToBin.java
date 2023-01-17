package cognizant;

public class DecimaToBin {

	public static void main(String[] args) {
		
		int n=10;
		int arr[]=new int[4];
		int index=0;
		
		while(n>0) {
			arr[index]=n%2;
			index++;
			n=n/2;
		}
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]);
		}
		
		
	}

}