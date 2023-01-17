package cognizant;

public class evenodd {
	public static void main(String[] args) {
		int arr[]= {1,2,5,4,7,8,11,20};
		evenoddnum(arr);
	}
	
	public static void evenoddnum(int arr[]) {
		int i;
		int e[]=new int[arr.length];
		int index=0;
		for(i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				e[index]=arr[i];
				index++;
			}
		
		}
		
		for(i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				e[index]=arr[i];
				index++;
			}
		
		}
		
		System.out.println("Array elements after :");
		for(i=0;i<arr.length;i++) {
			System.out.printf(" %d\t",e[i]);
		}
	}

}
