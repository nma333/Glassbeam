package enumarate;

enum Company{
	APPLE,
	Google,
	Microsoft;
}


public class First {

	public static void main(String[] args) {
		/*An enum type is a special data type that enables for a variable to be a set of predefined constants
		 * 
		 * */ 
		Company c=Company.APPLE;
		System.out.println(c);
		
		switch(c) {
		case APPLE:
			System.out.println("Apple");
			break;
		case Google:
			System.out.println("Naveen");
		default:
			System.out.println("Default");
			break;
			
		
		}
	
		

	}

}
