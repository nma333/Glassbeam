package array;

public class Nextgreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {11,21,13,14};
		int i,j,next;
		for( i=0;i<arr.length;i++) {
			next=-1;
			for( j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					next=arr[j];
					break;
				}
			
			}
			System.out.println(arr[i]+" "+next);
		}

	}

}
