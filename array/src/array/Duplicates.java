package array;

public class Duplicates {
	
	public static void func(int arr[]) {
		int temp[]=new int[arr.length];
		int in=0;
		System.out.println("arr before sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" \t");
		}
		System.out.println("");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int a=arr[i];
					arr[i]=arr[j];
					arr[j]=a;
				}
			}
		}
		System.out.println("arr after sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" \t");
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[in++]=arr[i];
			}
		}
		temp[in++]=arr[arr.length-1];
		System.out.println("arr after duplicate removing:");
		for(int i=0;i<in;i++) {
			System.out.print(temp[in] +" \t");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,9,4,2,9,7,3,6,7,5,2,7,6,9,};
		func(arr);

	}

}
