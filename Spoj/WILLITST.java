/*
3 4 2 1 5 3 4 2 1 5
prob link:- https://www.spoj.com/problems/WILLITST/
idea :- idea here is to check if num is power of 2 or not
Simple way to check the above is do check
num&(num-1) == 0 or not

*/
import java.util.*;
class WILLITST {
	public static boolean isPowOf2(long a) {
		if ((a&(a-1) == 0)) return true;
		return false;
 	}
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		long n = kb.nextLong();
		if (isPowOf2(n)) {
			System.out.println("TAK");
		}else {
			System.out.println("NIE");
		}
	}
}
