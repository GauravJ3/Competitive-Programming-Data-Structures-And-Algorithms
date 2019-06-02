// Bottom up DP
import java.io.*;
import java.util.*;
class EditDistance {
	public static int minOps(String s1, String s2, int m, int n,int [][] dp) {
		// Base Case
		if (m == 0) return n; // Add all the char of string s2
		if (n == 0) return m; // delete all the char of string s1
		// Check the last char of both the string
		if (dp[m][n] != 0) return dp[m][n];
		if (s1.charAt(m-1) == s2.charAt(n-1)) dp[m][n] = minOps(s1, s2, m-1, n-1, dp);
		else
			dp[m][n] = 1 + Math.min(Math.min(minOps(s1, s2, m-1, n, dp), minOps(s1, s2, m, n-1, dp)), minOps(s1, s2, m-1, n-1, dp));
		return dp[m][n];
	}
	public static void main(String []args) {
		Scanner kb = new Scanner(System.in);
		int T = kb.nextInt(); // num of Test Case
		while (T-- > 0) {
			String s1 = kb.next();
			String s2 = kb.next();
			int m = s1.length();
			int n = s2.length();
			// min operation to convert s1 -> s2
			int [][]dp = new int[m+1][n+1];
			int ans = minOps(s1, s2, m, n, dp);
			System.out.println(ans);
		}	
	}
}