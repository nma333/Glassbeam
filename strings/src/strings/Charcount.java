package strings;

public class Charcount {
	public static Integer charcounter(String in) {
		Integer j=0;
		for(int i=0;i<in.length();i++) {
			if(in.charAt(i)==' ' || in.charAt(i)==',') {
				continue;
			}
			else {
				j++;
			}
		}
		return j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(charcounter("Naveen,Mahantesh,Ankasadaddi"));

	}

}
