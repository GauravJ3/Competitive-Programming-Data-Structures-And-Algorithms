/*
Link :- https://www.hackerrank.com/challenges/max-array-sum/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dynamic-programming 
*/
import java.util.*;
class MaxSum {
	public static int maxSum(int[] arr) {
		// make the array
		// for array in java -> length is property and not method.
		int []maxSumSubarray = new int[arr.length];
		// for i=0 i=1 -> the maxSumSubarray -> a[0] and a[1]
		maxSumSubarray[0] = arr[0];
		maxSumSubarray[1] = arr[1];
		for (int i = 2; i < arr.length; i++) {
			maxSumSubarray[i] = Math.max(arr[i], Math.max(arr[i] + maxSumSubarray[i-2], maxSumSubarray[i-1]));
		}
		return maxSumSubarray[arr.length-1];
	}
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(bf.readLine());
		// make an array
		String s[] = bf.readLine().split(" ");
		int []arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
		int ans = maxSum(arr);
		System.out.println(ans + " " + "is the maximum sum of the subarray.");
	}
}