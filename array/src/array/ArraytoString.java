package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class ArraytoString {
	protected int num=10;

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int index = 2;
		int res[]=func(arr, index);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(res));
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
//		System.out.println(Arrays.toString(arr));
//
//		String name = "Naveen";
//		System.out.println(name);
//
//		ArrayList<Integer> a = new ArrayList<Integer>();
//		a.add(1);
//		a.add(2);
//		a.add(3);
//		a.add(4);
//		System.out.println(a);
//		System.out.println(a.toString());
//
//		LinkedHashMap<Integer, Character> l = new LinkedHashMap<Integer, Character>();
//		l.put(10, 'N');
//		l.put(20, 'A');
//		System.out.println(l.toString());
//
//		l.forEach((n, m) -> System.out.println(n + " " + m));
//		for (Map.Entry<Integer, Character> r : l.entrySet()) {
//			if (r.getKey() > 1) {
//				System.out.println("Greater");
//			} else {
//				System.out.println("Not greater");
//			}
//
//		}

	}

	private static int[] func(int[] arr, int index) {
		int result[] = new int[arr.length-1];
		for (int i = 0, k = 0; i < arr.length; i++) {
			if (i == index) {
					continue;
			}
			result[k++]=arr[i];
		}

		return result;

	}

}
