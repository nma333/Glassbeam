package strings;

public class Lastword {
	static  public void splitsbyWords(String in) {
		String arr[]=in.split(" ");
		for(int i=0;i<arr.length;i++) {
			String j=arr[i];
			System.out.println(j.charAt(j.length()-1));
		}
	}
	
	public static void pair(int arr[],int sum) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum) {
					System.out.println(arr[i]+" "+arr[j]);
					}
				}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Naveen MAhantesh Ankasadaddi";
		splitsbyWords(name);
		int arr[]=new int[] {10,20,30,40,50};
		int sum=50;
		pair(arr,sum);

	}

}
