/*
	Codechef Practice (Easy), (ad-hoc)
	Problem Link -> https://www.codechef.com/problems/POTATOES
	Here I've utilized recursive way to solve the problem
*/

import java.util.*;
class Potatoes {
	public static boolean isPrime(int n) {
		for (int i= 2; i <= Math.sqrt(n); i++)
			if (n % i == 0)
				return false;

		return true;
	}
	public static int findNextPrime(int num) {
		if (!isPrime(num+1)) {
			return findNextPrime(num+1);   			
		}else {
			return num+1;
		}
	}
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int T = kb.nextInt();
		while (T-- > 0) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int sum = a + b;
			int ans = findNextPrime(sum);
			System.out.println(ans - sum);				
		}
	}
}