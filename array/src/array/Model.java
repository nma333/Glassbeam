package array;

public class Model {
	public static void insertion(int arr[]) {

		int ele = 50;
		int index = 3;
		int narr[] = new int[arr.length + 1];
		for (int i = 0; i < arr.length + 1; i++) {
			if (i < index - 1) {
				narr[i] = arr[i];
			} else if (i == index - 1) {
				narr[i] = ele;
			} else {
				narr[i] = arr[i - 1];
			}
		}
		for (int i = 0; i < narr.length; i++) {
			System.out.println(narr[i] + " ");
		}

	}

	public static void delete(int arr) {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 1, 2, 3, 4, 5 };
		insertion(arr);

	}

}
