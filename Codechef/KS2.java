/*
	Codechef June Long Challenge
	Problem Link :- https://www.codechef.com/JUNE19B/problems/RSIGNS
	Time Complexity :-  O(logK) as we are in worst case diving by 2 everytime.
*/
import java.io.*;
import java.util.*;
class KS2 {
	public static long calPow(long k, long a) {
		final long MOD = 1000000007;
		// calculate pow 2**k
		if (k == 0) return 1;
		if (k%2 != 0) {
			return a*(calPow((k-1)/2, (a*a)%MOD))%MOD; 
		}
		return calPow(k/2, (a*a)%MOD);
	}
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		while (T-- > 0) {
			long k = Integer.parseInt(bf.readLine());
			long a = 2;
			long ans = calPow(k-1, a); // 2**(k-1)
			ans = ans*10;
			ans = ans%(long)(Math.pow(10,9)+7);
			System.out.println(ans);	
		}
	}
}