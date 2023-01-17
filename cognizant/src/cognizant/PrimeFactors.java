package cognizant;
import java.util.*;

public class PrimeFactors {
	static int Stack[]=new int[5];
	static int index=-1;
	static Scanner sc=new Scanner(System.in);
	
	public static void push() {
		if(index==4) {
			System.out.println("Stack is overflow");
		}
		else {
			System.out.println("Enter the elemnets to push:");
			int num=sc.nextInt();
			index++;
			Stack[index]=num;
			
		}
	}
	public static void pop() {
		if(index==-1) {
			System.out.println("Stack is Underflow");
		}
		else {
			System.out.printf("removed %d\n",Stack[index]);
			index--;
		}
	}
	public static void display() {
		if(index==4) {
			System.out.println("Stack is overflow");
		}
		else if(index==-1) {
			System.out.println("Stack is Underflow");
		}
		else {
			System.out.println("Content of the stack:");
			for(int i=0;i<index;i++) {
				System.out.print(Stack[i]+"\t");
			}
		}
		System.out.println("\n");
		
		
	}

	public static void main(String[] args) {
		while(true) {
			System.out.println("Enter your choice");
			System.out.println("1.Push \t 2.Pop \t 3.Display \t 4.Exit ");
			int choice=sc.nextInt();
				switch(choice){
				case 1:
					push();
					break;
				case 2:
					pop();
					break;
				case 3:
					display();
					break;
				case 4:
					System.exit(0);
				default:
					System.out.println("Enter the valid choice");
					
				}
		}
	}

}
