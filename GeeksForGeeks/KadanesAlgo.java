/*
	Kadane's Algorithm :- 
	pseudo code :-
	first initialize:
	max_so_far = 0 and total_sum = 0
	then for every element in array:
		{check for -ve elements in array}
		a.) if every element is -ve i.e. return the biggest element
		ex:- arr[] => {-1, -5, -8, -6, -2};
		biggest element is -1 ?(why ? search yourself) 
		return -1 (or alternatively print -1)
		else:
			a.) calculate sum += arr[i]
			b.) check if sum < 0 => sum = 0 
			c.) if max_so_far < sum :
			max_so_far = sum
		return max_so_far(or print alternatively)

	Source -> https://practice.geeksforgeeks.org/problems/kadanes-algorithm/0	 
	Time Complexity -> O(N) {Worst case even if we use our own sorting algo}
	Space Complexity -> O(N)
*/


import java.util.*;
class KadanesAlgo {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();
		while (t-- > 0){
			int N = kb.nextInt();
			int []arr = new int[N];
			for (int i = 0; i < N; i++)			// O(N) -> Operation 
				arr[i] = kb.nextInt();
			int maxSoFar = 0;					// initializing max_so_far
			int sum = 0;
			int count = 0;						// count to keep track of numb of -ve elements
			for (int x : arr){
				if (x < 0)count++;
			}
			if (count == N) {								// Arrays.sort(arr) use quick sort-> O(NLogN) Space complexity-> O(1)
				Arrays.sort(arr);							// The Array has every element -ve 
				maxSoFar = arr[N-1];						// ex:- arr[] => {-1, -2, -3, -4} 
															// sort the array arr[]=> {-4, -3, -2, -1}
			}else {
				for (int i = 0; i < N; i++) {				// O(N)
					sum += arr[i];
					if (sum > maxSoFar)	
						maxSoFar = sum;					// if we come in this else condition.. maxSoFar is 0 here
					if (sum < 0) sum = 0;				
				}
			}
			System.out.println(maxSoFar);
		}

		
	}
}