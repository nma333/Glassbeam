package array;
import java.io.*;

public class Userinput2d {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int arr[][]=new int[3][3];
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader bf=new BufferedReader(is);
		//System.out.println(arr.length);
		System.out.println("Enter the elements:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				int k=Integer.parseInt(bf.readLine());
				arr[i][j]=k;
				
			}
			
		}
		
		
		
		
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}

	}

}
