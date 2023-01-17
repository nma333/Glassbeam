package array;

class add{
	public int add(int ...a ) {
		int sum=0;
		for(int i:a) {
			 sum=sum+i;
		}
		return sum;
		
	}
}

public class Array {

	public static void main(String[] args) {
		add obj=new add();
		System.out.println(obj.add(10, 20,30,40));
		
		

	}

}
