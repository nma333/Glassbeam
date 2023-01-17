package cognizant;


public class Practice {
	

	public static void main(String[] args) { 
		int n=10;
		int num=n;
		int arr[]=new int[4];
		int index=0;
		
		while(n>0) {
			arr[index]=n%2;
			index++;
			n=n/2;
		}
		System.out.printf("%d in integer %d is and in binary is :",num,num);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			
		}

	}

}
