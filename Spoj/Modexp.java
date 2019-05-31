/*
	SPOJ -> https://www.spoj.com/problems/LASTDIG/
	Reference -> https://www.hackerearth.com/practice/math/number-theory/basic-number-theory-1/tutorial/
	Time Complexity -> O(log n) where n is the power
*/
import java.util.*;
class Modexp {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int T = kb.nextInt();
		// in our input buffer we have "enter" key stored
		// to remove the enter from buffer
		kb.nextLine();
		while (T-- >0) {
			// take a and b input
			String s[] = kb.nextLine().split(" ");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			// now apply the modular expo principle to calculate a^b in O(log b)
			// iterative approch
			int res = 1;
			while (b > 0) {
				if (b % 2 == 1) {
					// if b is odd
					res = (res * a)%10; // since we want the last digit
				}
				a = (a*a)%10; // since we want last digit
				b = b/2;
			}
			System.out.println(res);  // we have the lastt digit of the 
		}
	}
}	