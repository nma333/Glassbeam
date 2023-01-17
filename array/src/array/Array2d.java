package array;

public class Array2d {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		//t sum=0;
		int psum=0;
	    int ssum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				
				if(i==j)
					psum=psum+arr[i][j];
				else if(i+j==2)
					ssum=ssum+arr[i][j];
			}
			System.out.println();
		}
		System.out.println(psum);
		System.out.println(ssum);
		
		
		

	}

}
