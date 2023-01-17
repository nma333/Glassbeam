package strings;
import java.util.*;
class Model{
	public String name;
	Model(String name){
		this.name=name;
	}
}

public class Chetan {

	public static void main(String[] args)  {
		//Using new keyword
		Model obj=new Model("Naveen");
		System.out.println("Using new:"+obj.name);
		
		//Class.class.newInstances()
		try {
			@SuppressWarnings("deprecation")
			Model o=Model.class.newInstance();
			System.out.println(o.name);
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		


	}

}
