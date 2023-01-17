package array;

import java.util.Scanner;

public class Wone {

	public static void main(String[] args) {
		int r=4;
		int c=4;
		int [][] arr=new int[r][c];
		int row = 0 ,col = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements into the array:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the elements to search in the array:");
		int element=sc.nextInt();
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(arr[i][j]==element) {
					row=i;
					col=j;
					break;
				}
			}
		}
		int sum=row+col;
		
		int z=arr[sum+1][col];
		int x=z;
		int sum1=0;
		while(z!=0) {
			int n=z%10;
			sum1=sum1+(n);
			z=z/10;
		}
		System.out.println(sum);
		System.out.println(x);
		System.out.println(sum1);
		
		
		
		

	}

}
