package cognizant;

public class Model {
	public static void prime(int num) {
		int count = 0;
		for (int i = 2; i < num - 1; i++) {
			if (num % i == 0) {
				count++;
				break;
			}

		}
		if (count > 0)
			System.out.println("Not a prime");
		else

			System.out.println("Prime ");
	}
	
	public static int count(int num) {
		int digit=0;
		int temp=num;
		while(num !=0) {
			num=num%10;
			digit++;
		}
		return digit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prime(41);
		System.out.println(count(123));

	}

}
