package array;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Insert {
	public static int[]  insertion(int arr[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Entr the index to insert:");
		int index=sc.nextInt();
		System.out.println("Entr the num to insert:");
		int num=sc.nextInt();
		int n=arr.length;
		int newarr[]=new int[n+1];
		for(int i=0;i<n+1;i++) {
			if(i<index-1) {
				newarr[i]=arr[i];
			}
			else if(i==index-1) {
				newarr[i]=num;
				
			}else {
				newarr[i]=arr[i-1];
			}
		}
		return newarr;
	}
	
	public static int[] ins(int arr[] ) throws  IOException {
		InputStreamReader in =new InputStreamReader(System.in);
		BufferedReader r=new BufferedReader(in);
		System.out.println("Enter the position to insert:");
		int pos=Integer.parseInt(r.readLine());
		System.out.println("Enter the number:");
		int number=Integer.parseInt(r.readLine());
		for(int i=arr.length-1;i>pos;i--) {
			arr[i]=arr[i-1];
			
		}
		arr[pos-1]=number;
		return arr;
	}

	public static void main(String[] args)  throws  IOException{
		// TODO Auto-generated method stub
		int num[]= {1,2,3,4,5};
		
		int newarr[]=ins(num);
		
		for(int i=0;i<newarr.length;i++) {
			System.out.println(newarr[i]);
		}

	}

}
