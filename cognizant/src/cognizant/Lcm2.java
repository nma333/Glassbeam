package cognizant;
import java.io.*;
public class Lcm2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader bf=new BufferedReader(is);
		System.out.println("Enter three numbers:");
		int a=Integer.parseInt(bf.readLine());
		int b=Integer.parseInt(bf.readLine());
		int c=Integer.parseInt(bf.readLine());
		int temp=1;
		while(true) {
			if(temp%a==0 && temp%b==0) {
//				System.out.println("Lcm of two numbers:"+temp);
				break;
			}
			else {
				temp++;
			}
		}
		int lcm1=temp;
		temp=1;
		
		while(true) {
			if(temp%lcm1==0 && temp%c==0) {
//				System.out.println("Lcm of two numbers:"+temp);
				break;
			}
			else {
				temp++;
			}
		}
		System.out.println("Lcm of two numbers:"+temp);

}
}