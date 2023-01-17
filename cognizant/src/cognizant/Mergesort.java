package cognizant;

import java.util.Arrays;

public class Mergesort {

	public static void main(String[] args) {
		int arr1[]= {10,5,9,19,59};
		int arr2[]= {2,14,32,8,20};
		
		int merge[]=new int[arr1.length+arr2.length];
		System.arraycopy(arr1, 0, merge, 0, arr1.length); 
		System.arraycopy(arr2,0, merge,  arr1.length, arr2.length);
		
		Arrays.sort(merge);
		for(int i=0;i<merge.length;i++) {
			System.out.print(merge[i]+" ");
		}

	}

}
