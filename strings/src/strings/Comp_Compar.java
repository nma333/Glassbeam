package strings;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Laptops{
	private String name;
	private int ram;
	private int rom;
	
	public Laptops(String name, int ram, int rom) {
		super();
		this.name = name;
		this.ram = ram;
		this.rom = rom;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getRom() {
		return rom;
	}
	public void setRom(int rom) {
		this.rom = rom;
	}
//	@Override
//	public String toString() {
//		return "dem [name=" + name + ", ram=" + ram + ", rom=" + rom + ", getName()=" + getName() + ", getRam()="
//				+ getRam() + ", getRom()=" + getRom() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
//				+ ", toString()=" + super.toString() + "]";
//	}
	//@Override
//	public int compareTo(Laptops o) {
//		// TODO Auto-generated method stub
//		if(this.ram>o.getRam())
//			return 1;
//		else 
//			return -1;
//		
//	}
	
	
	
}

public class Comp_Compar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Laptops> l=new ArrayList<>();
		l.add(new Laptops("Apple",16 , 1000));
		l.add(new Laptops("Samsung",16 , 100));
		l.add(new Laptops("Dell",8 , 1000));
		
		Comparator<Laptops> comp=new Comparator<Laptops>() {
			
			@Override
			public int compare(Laptops o1, Laptops o2) {
				// TODO Auto-generated method stub
				if(o1.getRam()>o2.getRam())
					return 1;
				else
					return -1;
			}
		};
		Collections.sort(l,comp);
		System.out.println(l);
		

	}

}
