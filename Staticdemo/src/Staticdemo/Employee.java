package Staticdemo;

class Ceo{
	int eid;
	double salary;
	static String name;
	
	public Ceo(){
		eid=2;
		salary=12989.9;
		name="Sundhar";
	}
	public void show() {
		System.out.println(name );
	}
}
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ceo obj1=new Ceo();
//		obj1.eid=1;
//		obj1.name="Naveen";
//		obj1.salary=1999.98;
		
		Ceo obj2=new Ceo();
//		obj2.eid=2;
//		obj2.name="Virat";
//		obj2.salary=20000;
//		obj2.name="Naveen";
		
		obj1.show();
		obj2.show();
		
		
	}

}
