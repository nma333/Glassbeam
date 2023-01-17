package cognizant;

public class Substring {
	public static void substring(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print(j);
				
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Naveen";
		substring(name);

	}

}
