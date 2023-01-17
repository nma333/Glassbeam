package fileHandling;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapiter {
	public static void show(String in) {
		TreeMap<Character, Integer> l=new TreeMap<Character,Integer>();
		Integer k=1;
		for(int i=0;i<in.length();i++) {
			
			if(l.containsKey(in.charAt(i))) {
				k++;
				l.put(in.charAt(i), k);
				
			}
			else {
				k=1;
				l.put(in.charAt(i), k);
			}	
		}
		l.forEach((n,m)->System.out.println(n+" "+m));
		
		for(Map.Entry<Character, Integer> u:l.entrySet()) {
			Character c=u.getKey();
			Integer i=u.getValue();
			
			if(i>1)
				System.out.print(c+""+i);
			else
				System.out.print(c);
		}
		
	}

	public static void main(String[] args) {
	
//		HashSet<Integer> h=new HashSet<Integer>();
//		h.add(100);
//		h.add(200);
//		for(Integer i:h)
//			System.out.println(i);
//		
//		Iterator<Integer> iter=h.iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
//			
//		
//		h.forEach(n->System.out.println(n));
		show("NaveenN");
		

	}

}
