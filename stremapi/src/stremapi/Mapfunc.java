package stremapi;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Mapfunc {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[]=new String[] {"naveen","mahantesh","ankasadaddi"};
		Stream<String> n=Arrays.stream(names);
		Stream<String> up=n.map(ne->ne.toUpperCase());
		up.forEach(i->System.out.println(i));
		
		
		int arr[]=new int[] {4,8,1,5,2,9};
		IntStream a=Arrays.stream(arr);
		
		

	}

}
