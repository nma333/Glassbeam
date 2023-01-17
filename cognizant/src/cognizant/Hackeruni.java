package cognizant;
import java.util.*;

public class Hackeruni {
	public static List<Integer> h(List<Integer> in){
		List<Integer> li=new ArrayList<Integer>();
		for(int i=0;i<in.size();i++) {
			if(in.get(i)>=38) {
				int mod=in.get(i)%5;
				if(mod>=3) {
					int num=in.get(i)+(5-mod);
					li.add(num);
					
				}
				else {
					li.add(in.get(i));
				}
			}
			else {
				li.add(in.get(i));
			}
		}
		
		return li;
		
	}

	public static void main(String[] args) {
		
		List<Integer> li=new ArrayList<Integer>();
		li.add(38);
		li.add(33);
		li.add(88);
		li.add(55);
		li.add(98);
		
		List<Integer> li1=new ArrayList<Integer>(h(li));
		System.out.println(li);
		System.out.println(li1);

	}

}
