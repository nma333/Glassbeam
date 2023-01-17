package array;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=3;
		int c=3;
		Scanner sc=new Scanner(System.in);
		int[][] arr=new int[r][c];
		System.out.println("Enter the elements into the arr:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int[] earr=new int[5];
		int [] oarr=new int[5];
		int eindex=0;
		int oindex=0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if((arr[i][j])%2==0) {
					earr[eindex]=arr[i][j];
					eindex++;
				}
				else {
					oarr[oindex]=arr[i][j];
					oindex++;
				}
			}
		}
		System.out.println("even elements in the arr");
		for(int i=0;i<earr.length;i++) {
			System.out.println(earr[0]);
		}
		System.out.println("odd elements in the arr");
		for(int i=0;i<earr.length;i++) {
			System.out.println(oarr[0]);
		}

		

	}

}
