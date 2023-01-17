package cognizant;

public class Equals {
	public static boolean comp(int arr1[],int arr2[]) {
		boolean result=false;
		if(arr1.length==arr2.length) {
			for(int i=0;i<arr1.length;i++) {
				for(int j=0;j<arr1.length;j++) {
					int a=arr1[i];
					arr1[i]=arr2[j];
					arr2[j]=a;
					
				}
			}
			for(int i=0;i<arr2.length;i++) {
				for(int j=0;j<arr2.length;j++) {
					int a=arr1[i];
					arr1[i]=arr2[j];
					arr2[j]=a;
					
				}
			}
			for(int i=0;i<arr1.length;i++) {
				if(arr1[i]==arr2[i])
					result=true;
				else
					result=false;
					
			}
			return result;
			
		}
		else	
			return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,4,9};
		int arr2[]= {5,4,3,2,1};
		System.out.println(comp(arr1,arr2));

	}

}
