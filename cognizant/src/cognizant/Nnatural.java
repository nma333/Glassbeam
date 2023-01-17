package cognizant;

public class Nnatural {
	
	public static void natural(int arr[],int range) {
		int index=0;
		int missing[]= new int[10];
		for(int i=1;i<=range;i++) {
			if(i!=arr[i]) {
				missing[index++]=i;
			}else {
				continue;
			}
		}
		System.out.println("The missing numbers are:");
		for(int i=0;i<missing.length;i++) {
			System.out.println(missing[i] +" \t");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,5,7,9,10};
		
		natural(arr,arr.length);
	}

}
