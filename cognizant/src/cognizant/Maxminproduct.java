package cognizant;

public class Maxminproduct {
	public static void func(int arr[]){
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int a=arr[i];
					arr[i]=arr[j];
					arr[j]=a;
				}
			}
		}
		int ssum=arr[1]+arr[0];
		int msum=arr[arr.length-1]+arr[arr.length-2];
		int product=ssum*msum;
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%d\t",arr[i]);
		}
		System.out.println();
		System.out.printf("%d",product);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {9,45,22,10,8};
		func(arr);
	}
}
