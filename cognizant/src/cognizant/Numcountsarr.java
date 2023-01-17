package cognizant;

import java.util.HashMap;

public class Numcountsarr {

	public static HashMap<Integer, Integer> countsnum(int arr[]) {

		HashMap<Integer, Integer> c = new HashMap<Integer, Integer>();
		Integer j = 1;
		for (int i = 0; i < arr.length; i++) {

			if (c.containsKey(arr[i])) {

				j++;
				c.put(arr[i], j);

			} else {
				j = 1;
				c.put(arr[i], j);
			}

		}
		return c;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 1, 21, 3, 4, 9, 8, 1, 2, 4, 3, 2, 67, 98, };
		System.out.println(countsnum(arr));

	}

}
