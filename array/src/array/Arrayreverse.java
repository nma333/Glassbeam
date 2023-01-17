package array;

public class Arrayreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int res[]=new int[arr.length];
		
		int count=arr.length-1;
//		while (count<arr.length) {
//			res[count]=arr[count];
//			count++;
//		}
		for(int i=0;i<arr.length;i++) {
			res[count]=arr[i];
			count--;
			
		}
		System.out.println("Elements in reverse order:");
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
		

	}

}
