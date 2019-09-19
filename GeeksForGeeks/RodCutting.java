/*
* Link :- https://www.geeksforgeeks.org/cutting-a-rod-dp-13/
*
* Problem description :- Given an integer N denoting the Length 
* of a line segment. you need to cut the line segment in such a way
* that the cut length of a line segment each time is integer 
* either x , y or z. and after performing all cutting operation 
* the total number of cutted segments must be maximum. 
*
* Example
*
*	Input
*
*	2
*	4
*	2 1 1
*	5
*	5 3 2
*
*
*	Output
*	4
*	2
*
*/
import java.util.*;
class RodCutting {
	public static int findMaxCut(int N, int a, int b, int c, int []DP) {
		if (N == 0) DP[N] = 0;
		if (N < 0) return -1;
		// Base Case
		if (DP[N] != -2) return DP[N];
		// max cut using a
		int mA = findMaxCut(N-a, a, b, c, DP);
		// max cut using b
		int mB = findMaxCut(N-b, a, b, c, DP);
		// max cut using c
		int mC = findMaxCut(N-c, a, b ,c, DP);
		DP[N] = Math.max(mA, Math.max(mB, mC));
		if (DP[N] != -1) DP[N] = DP[N] + 1;
		return DP[N];
	}
	public static int findMaxCut(int N, int a, int b, int c) {
		// First form a recursive relation / solve it using recursion
		// Using recursion we will be getting O(3^N) time complexity
		// Dynamic Programming - Top Down approach
		int []DP = new int[N+1];
		// Java Trick to fill arrays
		// for arrayList -> Collections.fill(arrayListReference, value)
		
		Arrays.fill(DP, -1);
		DP[0] = 0; // 2 1 1 
		// [0, 1, 2, 3, 4]
		for (int i = 1; i <= N; i++) {
			if ((i-a) >= 0) DP[i] = Math.max(DP[i], DP[i-a]);
			if ((i-b) >= 0) DP[i] = Math.max(DP[i], DP[i-b]);
			if ((i-c) >= 0) DP[i] = Math.max(DP[i], DP[i-c]);
			if (DP[i] != -1) DP[i] = 1+DP[i];
		}
		return DP[N];
	}
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int T = kb.nextInt();
		// number of test cases
		while (T-- >0) {
			int n = kb.nextInt(); // length of the rod
			int a = kb.nextInt(); // cut #1
			int b = kb.nextInt(); // cut #2
			int c = kb.nextInt(); // cut #3
			int []dp = new int[n+1];
			Arrays.fill(dp, -2);
			int myAns = findMaxCut(n, a, b, c, dp);
			int ans = findMaxCut(n, a, b, c);
			System.out.println("Maximum cuts we can get using bottom up approach " + ans);
			System.out.println("Maximum cuts we can get using top Down DP approach" + myAns);
		}
	}
}