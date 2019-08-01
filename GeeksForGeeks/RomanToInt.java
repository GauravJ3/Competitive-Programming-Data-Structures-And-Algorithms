/*
Given a string A representing a roman numeral.
Convert A into integer.

A is guaranteed to be within the range from 1 to 3999.
*/
		
import java.util.*;
import java.io.*;
class RomanToInt {
	public static int value(char c) {
		if (c == 'I') return 1;
		if (c == 'V') return 5;
		if (c == 'X') return 10;
		if (c == 'L') return 50;
		if (c == 'C') return 100;
		if (c == 'D') return 500;
		if (c == 'M') return 1000;
		return 0;
	}
	public static int romanToInt(String A) {
		// take len of string
		int len = A.length();
		int sum =  0;
		// Converting to char array
		char []ch = A.toCharArray();
		for (int i = 0; i < len-1; i++) {
			int a1 = value(ch[i]);
			int a2 = value(ch[i+1]);
			// check for a1 != 0
			if (a1 == 0) continue;
			if (a2 == 0 || a1 >= a2) sum += a1;
			else sum -= a1;
		}
		sum += value(ch[len-1]);
		return sum;
	}
	public static void main(String[] args) {
		Scanner kb = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String str = kb.next();
		int ans = romanToInt(str);
		System.out.println(ans);
	}
}