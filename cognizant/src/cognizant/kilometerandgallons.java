package cognizant;
import java.util.*;
import java.math.*;
import java.text.*;
public class kilometerandgallons {
	
	
	public static void calc() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of liters to fill the tank ");
		float liters=sc.nextFloat();
		System.out.println("Enter the distance covered");
		float  distance=sc.nextFloat();
		if(liters<0 || distance<0) {
			System.out.println("Invalid input");
		}
		else {
			float calc1=(liters/distance)*100;
			System.out.format("Liters/100KM\n" +String.format("%.2f",calc1) );
			System.out.printf("%.2f\n",calc1);
			double gallons=liters * 0.2642;
			double miles=distance * 0.6214;
			double calc2=(miles/gallons);
			System.out.println("Miles/gallons\n" +String.format("%.2f",calc2));
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc();

	}

}
