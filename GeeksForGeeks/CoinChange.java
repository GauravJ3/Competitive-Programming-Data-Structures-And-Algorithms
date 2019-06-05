/*
	Total number of coins
	[1, 2, 5] -> denominations
	amt -> 5
	1 way -> 1, 1, 1, 1, 1
	2 way -> 1, 1, 1, 2
	3 way -> 2, 2, 1
	4th way -> 5
4 possible ways in which i acn form amount
*/
// Brute Force solution  Time Complexity -> O(2^n)
// bottom-up
import java.util.*;
class CoinChange {
	public static int numOfWaysDP(int []coins,int len, int amt, int[] dp) {
		// make the dp 2 dimentional .. why> as 2 parameter are changing
		// coins[] and amt -> amt from 1 to amt
		// dp[amt][coins]
		if (len < 0) return 0;
		if (amt < 0) return 0;
		if (amt == 0) dp[amt] = 1;
		if (dp[amt] != 0) return dp[amt];
		dp[amt] = numOfWays(coins, len, amt-coins[len]) + numOfWays(coins, len-1, amt);
		return dp[amt];
	}
	public static int numOfWays(int []coins, int len, int amt) {
		// Base Case
		if (len < 0) return 0;
		if (amt < 0) return 0;
		if (amt == 0) return 1;
		return numOfWays(coins, len, amt-coins[len]) + numOfWays(coins, len-1, amt);	
	}
	public static void main(String[] args) {
		// array of coins
		// denominations from which i need to form a sum
		int coins[] = {1, 2, 5};
		// sum 
		int amount = 5;
		int ways = numOfWays(coins, 2, amount);
		int []dp=new int[amount+1];
		int waysDP = numOfWaysDP(coins, 2, amount, dp);
		System.out.println(ways + " ways using brute force" + "\nUsing DP => " + waysDP + " ways");

	}
}

