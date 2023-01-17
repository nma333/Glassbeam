package array;
import java.util.*;

public class Deletion {
	public static int[] delit(int arr[]) {
		Scanner sc=new Scanner(System.in);
		int n=arr.length;
		int narr[]=new int[n-1];
		int index=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(i<index) {
				narr[i]=arr[i];
			}
			else if(i==index) {
				continue;
			}
			else {
				narr[i-1]=arr[i];
				
			}
		}
		return narr;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int news[]=delit(arr);
		for(int i=0;i<news.length;i++) {
			System.out.print(news[i]+" ");
		}


	}

}
