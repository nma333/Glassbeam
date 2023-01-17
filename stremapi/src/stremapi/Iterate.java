package stremapi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Iterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Stream.iterate(1, n->n+1).filter(null)
		Set<Integer> s=new HashSet<Integer>();
		s.add(10);
		s.add(20);
		s.add(10);
		System.out.println(s);
		System.out.println(s);
	}

}
