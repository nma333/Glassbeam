package cognizant;
import java.util.Map;
import java.util.HashMap;
public class FrequencyOfEle {
	public static void counts(int arr[]) {
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i] +1));
			}
			else {
				map.put(arr[i], 1);
			}
		}
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,10,30,40,10};
		counts(arr);
	}

}
