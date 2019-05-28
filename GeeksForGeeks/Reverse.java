/*
	Prog to rotate the array about given point

*/
import java.util.*;
class Reverse {
	public static void reverse(int []arr, int start, int end) {
		while (start < end) {
			int tmp = arr[start];
			arr[start] = arr[end];
			arr[end] = tmp;
		}
	}
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int []arr = {4, 5, 8, 6, 9, 2, 7, 1};
		
		int k = 2;
		// output should be like this 
		// arr ->> [8, 6, 9, 2, 7, 1, 4, 5, 8]
		/* 
			Idea ->> 
			Reverse the array till k-1 
			and reverse the rest of array from ith element to the last
			now reverse the whole array
			Time Complexity -> O(N*K)
			Space Complexity -> O(1)
		*/ 
		int len = arr.length;	
		reverse(arr, 0, k-1);
		reverse(arr, k, len-1);	
		reverse(arr, 0, len-1);
		for (int i : arr) {
			System.out.print(i+ " ");
		}
		
	}
}