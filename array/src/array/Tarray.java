package array;

import java.util.Scanner;

public class Tarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=2;
		int c=2;
		Scanner sc=new Scanner(System.in);
		int[][] arr=new int[r][c];
		System.out.println("Enter the elements into the arr:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enetr the elemnet to search:");
		int num=sc.nextInt();
		int row=0;
		int col=0;
		boolean isnum=false;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(arr[i][j]==num) {
					isnum=true;
					row=i;
					col=j;
					break;
				}

			}
			
		}
		if(isnum) {
			System.out.println( " found at " + (row+1)  + " and " + (col+1));
		}else {
			System.out.println("Not found");
		}
		sc.close();

	}

}
