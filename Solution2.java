package glassbeam;

import java.util.Scanner;

public class Solution2 {
	//This function will return the product of all the digits of the entered number
	public static int fun(int num) {
		int mul = 1;
		while (num > 0) {

			mul = mul * (num % 10);
			num = num / 10;
		}
		return mul;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		// int num=4327;
		sc.close();

		int count = 0;
		//This while loop execute untill it becomes single digit and 
		//Initially count=0 but whenever the loop starts to execute it will increment by the value 1 and when the loop stops executes 
		//count wiil holds the value 'x'(for example) this amny times the while loop is executed
		while (num > 10) {
			num = fun(num);
			count++;
		}
		System.out.println(count + " Steps are required");
//		Data obj=new Data(10,"Naveen");
		
		
	}

}
