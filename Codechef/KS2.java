/*
	Codechef June Long Challenge
	Problem Link :- https://www.codechef.com/JUNE19B/problems/KS2
	Time Complexity :-  O(logK) as we are in worst case diving by 2 everytime.
*/
import java.io.*;
import java.math.*;
class KS2 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());
		long ten = 10;
		while (t-- > 0) {
			long n = Long.parseLong(bf.readLine());
			// n -> 2 ans -> 28
			int sum = 0; // calculate the sum of digits
			long a = n; // 2
			while (n > 0) {
				sum += (n % 10);
				n = n/10;
			}
			// sum -> 1
			long tmp = (ten-(sum%ten))%ten;
			BigInteger ans = new BigInteger("10");
			BigInteger m = new BigInteger(String.valueOf(a));
			// System.out.println("ans " + ans + " a " + a);
			ans = ans.multiply(m);
			long temp = tmp%10; 
			// System.out.println(temp);
			BigInteger b = new BigInteger(String.valueOf(temp));
			ans = ans.add(b);
			System.out.println(ans);
		}		
	}
}