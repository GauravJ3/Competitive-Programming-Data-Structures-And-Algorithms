/*
	Link :- https://www.interviewbit.com/problems/longest-common-prefix/
	Asked in: Google
	longest common prefix
Given an array of strings, your task is to find the longest common prefix string.
ex:- 
I/P :- [
        "abcdefgh",
        "aefghijk",
        "abcefgh"
        ]
O/P:-
    "a"
*/

import java.util.*;
import java.io.*;
class LongestCommonPrefix {
	public static String LCP(String[] st) {
		int len = st.length; // lenngth of the string array
		// find the smallest len string
		int min = Integer.MAX_VALUE;
		String st = "";
		for (int i = 0; i < len; i++) {
			if (min > st[i].length()) {
				min = st[i].length();
				str = st[i];
			}
		}
		// iterate through each string
		for (int i = 0; i < len; i++) {
			// check each char 
			for (int j = 0; j < str.length; j++) {
				if (str.charAt(j) != st[i].charAt(j)) {
					return str.substring(0, j); // return the substring frm 0 till j-1 th char
				}
			}
		} 
		// if not then return the smallest string
		return str;
	}
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String []arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.next();
		}

		String ans = LCP();
	}
}   