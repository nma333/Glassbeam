package cognizant;

public class Findcount {
	
	public static void main(String[] args) {
		String name="Naveen";
		int count=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='a') {
				count++;
				
			}
			else {
				continue;
			}
		}
		System.out.println(count);
		
		
	}
}