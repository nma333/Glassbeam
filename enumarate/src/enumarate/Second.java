package enumarate;

enum Compay{
	Apple,Ipods;
	int price=900;
	
	Compay(){
		price=809;
		System.out.println();
	}
	public int prices() {
		return price;
	}
}

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(Compay.Apple);

	}

}
