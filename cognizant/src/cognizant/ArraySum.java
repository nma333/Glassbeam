package cognizant;

import java.util.ArrayList;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {10,20,30,40,50};
		ArrayList<Integer> in=new ArrayList<Integer>();
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		for(int i=0;i<arr.length;i++) {
			in.add(sum+arr[i]);
		}
		System.out.println(in);

	}

}
