/*
	Problem Link :- www.interviewbit.com/problems/minimum-characters-required-to-make-a-string-palindromic/
*/
import java.util.*;
class MinChar {
	public static void isPalindrome(String s) {
		int start = 0, end = s.length()-1;
		while (start < end) {
			if (s.charAt(start) != s.charAt(end)) {
				return false;
			}else {
				start++;
				end--;
			}
		}
		return true;
	}
	public static void minCharToDel(String s) {
		int tmp = 0;
		String str = s;
		while (!isPalindrome(str)) {
			tmp++;
			str = str.substring(0, str.length() - 1);
		}
		return tmp;
	}
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str = kb.next(); 			// Taking the string
		int ans = minCharToDel(str); 
		System.out.println(ans);
	}
}