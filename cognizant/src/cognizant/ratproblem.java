package cognizant;

public class ratproblem {
	public static int ratprob(int r,int unit,int n,int arr[]) {
		if(arr==null) {
			return -1;
		}
		else {
			int mul=r*unit;
			int sum=0;
			for(int i=0;i<arr.length;i++) {
				sum=sum+arr[i];
				if(sum>=mul) {
					break;
				}
			}
			int tot=sum-mul;
			if(tot<0) {
				return 0;
			}
			else {
				return tot;
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {2,8,3,5,7,4,1,2};
		int out=ratprob(7,2,8,array);
		System.out.println(out);

	}
}
