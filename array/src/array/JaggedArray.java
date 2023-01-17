package array;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][];
		
		arr[1]=new int[1];
		arr[2]=new int[4];
		arr[3]=new int[2];
		for(int i[]:arr) {
			for(int j:i) {
				int k=sc.nextInt();
			}
			
		}
		System.out.println("Elements are:");
		for(int i[]:arr) {
			for(int j:i) {
				System.out.println(j+" ");
			}
			System.out.println();
		}
		

	}

}
