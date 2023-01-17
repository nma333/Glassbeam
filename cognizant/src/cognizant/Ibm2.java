package cognizant;

public class Ibm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123;
		int count=0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		System.out.println(count);
		char[] arr=new char[count];
		for(int i=count;i>=1;i--) {
			arr[i]=(char) ((char) num%10);
		}
//		for(int i=count;i>=1;i--) {
//			System.out.println(arr[i]);
//		}
//		

	}

}
