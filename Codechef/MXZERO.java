/*
	Problem Link :- https://www.codechef.com/problems/MXZERO
	Time Complexity :- O(N)
	Space Complexity :- O(1)
*/

import java.util.*;
class MXZERO {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		// cal how many 1's are there in the array
		// [1, 1, 1, 1, 1] -> odd num of 1's
		// ans => no. of 1's
		// [1, 1, 1, 1, 1, 1]  => for even number of 1's -> 0 ways
		// XOR Of all the num will be zero iff the numbers are in pairs
		// 0 xor any_number => any_number
		int t = kb.nextInt();
		while (t-- > 0) {
			int n = kb.nextInt();
			int []arr = new int[n];
			int count1 = 0;
			int count0 = 0;
			for (int i=0; i < n; i++){
				arr[i] = kb.nextInt();
				if (arr[i] == 1) count1++;
				if (arr[i] == 0) count0++;
			}
			if (count1 % 2 != 0) {
				// num of 1's are odd
				// remove 1 exactly once..
				System.out.println(count1);
			}else {
				// num of 1's are even ..
				// remove 0's exactly once
				System.out.println(count0);
			}
		}
	}
}