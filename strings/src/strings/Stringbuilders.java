package strings;

public class Stringbuilders {

	public static void main(String[] args) {
		/*=>Strings in java are immutable
		 * 
		 * */ 
		
		String name="Naveen";
//		name=name+ " Hello";
//		System.out.println(name );
		
		StringBuilder nm=new StringBuilder("Virat");
		nm.setCharAt(0, 'H');
		nm.insert(0, 'B');
		nm.delete(0, 3);
		nm.append('s');
		nm.setCharAt(0, 'R');
		nm.append(' ');
		nm.append('H');
		nm.append('e');
//		System.out.println(nm);
		
		
		String reversed="";
//		System.out.println(name);
//		System.out.println(reversed);
		
		for(int i=0;i<name.length();i++) {
			reversed=name.charAt(i)+reversed;
		}
		
		System.out.println(reversed);
		
		

	}

}
