/*
SPOJ Question CANDY3
link :- https://www.spoj.com/problems/CANDY3/
idea :- Question is very simple and basic,
		Idea here is to find a way to store large input.
		Don't look at the code until you've solved it on your own
		 

*/

import java.util.*;
class Candy3 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int T = kb.nextInt();
		int Temp = T;
		
			while (T-- > 0) {
				//kb.nextLine();
				long sum = 0;
				long n = kb.nextLong();
				long k = n;
				while(k-->0) {
					long a = kb.nextLong();
					sum = (sum+a)%n;
				}
				if (sum%n == 0) {System.out.println("YES");}
				else System.out.println("NO");
			}
		
	}
}