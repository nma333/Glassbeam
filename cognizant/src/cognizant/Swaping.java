package cognizant;

public class Swaping {
	public static void swap(int num1,int num2) {
		System.out.printf("Numbers before swaping: num1=%d and num2=%d", num1,num2);
//		int temp=num1;
//		num1=num2;
//		num2=temp;
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		/*for non zeros we can use mul and div operation
		 * a=a*b
		 * b=a/b
		 * a=a/b
		 * */
		System.out.println();
		System.out.printf("Numbers after swaping: num1=%d and num2=%d", num1,num2);
		
	}

	public static void main(String[] args) {
		int a=10;
		int b=20;
		swap(a,b);
		

	}

}
