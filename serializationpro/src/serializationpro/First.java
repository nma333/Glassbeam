package serializationpro;

class A{
	private int i;
	public A() {
		
	}
	public A(int i) {
		this.i=i;
	}
}

public class First {

	public static void main(String[] args) {
		A obj=new A(10);
		A obj1=obj;
		

	}

}
