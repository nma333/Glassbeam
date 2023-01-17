package cognizant;

public class Hypenproblem {
	
	public static String Hypen(String str,int n) {
		String res=" ";
		for(int i=0;i<n;i++) {
			if(str.charAt(i)=='-') {
				res=str.charAt(i)+res;
			}
			else {
				res=res+str.charAt(i);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Naeen-MahanteshAnkasadaddi";
		int n=str.length();
		String result=Hypen(str,n);
		System.out.println(result);


	}

}
