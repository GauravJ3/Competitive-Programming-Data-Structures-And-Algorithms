/*

	SPOJ Problem :- Alphacode
	link :- https://www.spoj.com/problems/ACODE/
	tags:- #Dynamic Programming

*/
/*
	Editorial :- Basically we need to find all possible number of decoding given A->1 .. Z->26
	we will be using Dynamic Programming for solving the problem
	we initialize dp[0] -> 1 // if we dont have any char then one possible way.. now way (assume it)(like let x = 1 in mathematics)
	 dp[i] => // if we take from [0 to i-1] characters, what will be the number of ways
	This dp[i] -> represent the number of decodings if we take till (i-1)th char
	now we will take the first 2 chars and see these 2 conditions
	if (the current char is already 1 - 9, then it will be equal to the dp[i-1])  // why?
	because, we will just append this int as it is with the previously formed numbers/decodings
	
	ex:-
	For ex take this
	dp[] = {1, 1, 2, 3, 0}
			0  1  2	 3  4
	num = 1213
		   ^	
		   i
	case1: when we are taking
		this char at i = 2 position
		num[i] == 2
		since it is in b/w 1 - 9
		dp[i] = dp[i-1] -> this means that for previously formed numbers we append this digit 
	// previously formed numbers -> "12" "1" and "1""1","2""1"
	if now take  21 
	and see if it is b/w 10 - 26

*/	
import java.util.*;
class Alphacode {
	public static long findAns(String s) {
		// first of all i will make a dp array to store res 
		// i.e number of ways to decode string from 0 to ith char
		long []dp = new long[s.length()+1];
		// if no char we take.. no way
		dp[0] = 1;
		dp[1] = 1;
		for (int i = 2; i <= s.length(); i++) {
			// take the prev 2 char and check if they are in the range
			// prev char
			// notice i ve taken s.charAt(i-1) as the present char to consider and the i-2 as the prev one
			// ive taken ith for the purpose of dp[] array

			int a = s.charAt(i-2)-'0';
			int b = s.charAt(i-1)-'0';
			int ans = a*10+b;
			// checking the first digit if it is not zero and b/w 1->9
			if(b <= 9 && b > 0) {
				dp[i] = dp[i-1];
			}
			// for checking of 2 digit numbes
			if (ans <= 26 && ans > 9) { // checking for 2 digit number
 				dp[i] += dp[i-2];
			}
			
		}
		return dp[s.length()];
	}
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String T;
		while(!(T = kb.next()).equals("0")) {
			long ans = findAns(T);
			System.out.println(ans);
		}
	}
}
