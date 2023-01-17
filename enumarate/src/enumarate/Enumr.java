package enumarate;
enum Days{
	Monday ,
	Tuesday ,
	Wednesday ,
	Thursday ,
	Friday ,
	Saturday,
	sunday
}


public class Enumr {
	
	public static int[] maxi(int arr[]) {
		int res[]=new int[3];
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i])
				max=res[i];
		}
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i])
				min=arr[i];
		}
		res[0]=max;
		res[1]=min;
		return res;
	}

	public static void main(String[] args) {
		
		Days d=Days.sunday;
		System.out.println(d.ordinal());
		
//		for(Days ds: Days.values()){
//			System.out.println(ds +"    " +ds.ordinal());
//		}
		int [] arr= {1,90,89,7863,0};
		int[] res=maxi(arr);
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
		
		
		
	}

}
