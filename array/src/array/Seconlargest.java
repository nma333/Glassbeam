package array;

public class Seconlargest {
//	public static void secondlarge(int arr) {
//		int large=arr[0];
//		for (int i=1;i<arr.length;i++) {
//			
//		}
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,200,98,1000,28999};
		int large=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>large) {
				large=arr[i];
			}
		}
		System.out.printf("Large number is %d",large);

	}

}
