/*
	Problem link: https://practice.geeksforgeeks.org/problems/key-pair/0
	Solution Approch: * By using binary search 
	Time Complexity : O(N*logN)
	Lang used: Java
	Constraints:
	1 ≤ T ≤ 100
	1 ≤ N ≤ 10^5
	1 ≤ A[i] ≤ 10^5
	Example:
Input:
2
6 16
1 4 45 6 10 8
5 10
1 2 4 3 6

Output:
Yes
Yes

Explanation:
Testcases 1:-
    10 and 6 are numbers making a pair
    whose sum is equal to 16
*/
import java.util.*;
import java.io.*;
class KeyPair {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		while (T-- > 0) {
			String s[] = bf.readLine().split(" ");
			int N = Integer.parseInt(s[0]);
			int K = Integer.parseInt(s[1]);
			String str[] = bf.readLine().split(" ");
			int []arr = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] =Integer.parseInt(str[i]);
			}
			// Logic starts from here
			Arrays.sort(arr);
			// first sort the array, so we can utilize binary search
			int tmp = 0; // this is for checking that wheter or not we successfully found the pair
			for (int i = 0; i < N; i++) {
				// for every element in the array arr[]
				if (K >= arr[i]) {
					int ele = K-arr[i];
					int index = Arrays.binarySearch(arr, ele);
					if (index >= 0 && index != i) {
						System.out.println("Yes, a pair exists whose sum is equal to " + K);
						tmp++; 	// yes, successfully found the pair, increment that tmp
						break;
					}
				}
			}
			if (tmp == 0) {		// i.e we didn't found the pair, whose sum is K
				System.out.println("No, there is no pair with sum " + K);
			}
		}
	}
}