package array;
import java.util.*;

public class Function {
	public static long fact(int n) {
		if(n<=0)
			return 1;
		else 
			return fact(n*n-1);
	}
	
	public static void traversal(int array[])
	{
		System.out.println("Array elements are:\n");
		for(int i=0;i<array.length;i++) {
			System.out.printf("%d\t",array[i]);
		}
		System.out.println();
	}
	public static void insert(int array[]) {
		int len=array.length;
		int[] arr=new int[len+1];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value to insert:\n");
		int num=sc.nextInt();
		System.out.println("Enter the position to insert:\n");
		int pos=sc.nextInt();
		for(int i=0;i>len+1;i++) {
			if(i<pos) {
				arr[i]=array[i];
			}
			else if(i==pos) {
				arr[i]=num;
			}
			else {
				arr[i]=array[i-1];
			}
			
		}
		
		sc.close();
	}
	
	public static void sort(int arr[]) {
		System.out.println(" Elements in the sorted order:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int a=arr[i];
					arr[i]=arr[j];
					arr[j]=a;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%d\t",arr[i]);
		}
		
	}
	
	public static void main(String[] args) {
		
		int arr[]= {9,2,8,4,20};
		
		
		//traversal(arr);
//		sort(arr);
		//traversal(arr);
		System.out.println(fact(3));

	}
	
}
