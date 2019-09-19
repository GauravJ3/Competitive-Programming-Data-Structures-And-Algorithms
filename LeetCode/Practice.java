/*
	I/P :- [1, 3, 3, 6, 5, 7, 0, -3], k = 3
	o/p :- [1, 3, 9, 54, 90, 210, 0, 0]
	vvovooovovvovoovoovvvvovovvvov
	# of vv => 7
	# of o => 13
	count => 32+20+4
	
*/
import java.util.*;
class Practice {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int []nums = {1, 3, 3, 6, 5, 7, 0, -3};
		int k = 3;
		int []ans = new int[8];
		int prod = 1;
		for (int i = 0; i < k; i++) {
			prod = prod * nums[i];
			ans[i] = prod;
		}
		for (int i = k; i < 8; i++) {
			if (nums[i] == 0) {
				ans[i] = 0;
				break;
			}
			prod = prod*nums[i];
			prod = prod/nums[i-k];
			ans[i] = prod;
		}
		for (int i = 0; i < 8; i++) {
			System.out.print(ans[i]+" ");
		}
		System.out.println();
	}
}