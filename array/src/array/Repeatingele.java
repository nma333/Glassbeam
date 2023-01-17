package array;

import java.util.ArrayList;
import java.util.List;

public class Repeatingele {
	public static void repeating(int arr[]) {
		int i,j;
		for(i=0;i<arr.length;i++) {
			for(j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i] +" is repeating");
				}
				
			}
		}

	}

	public static void main(String[] args) {
		int [] i= {1,2,3,1,5,9,2,5};
		repeating(i);

	}

}
