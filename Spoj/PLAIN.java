import java.io.*;
import java.util.*;
class PALIN {
	public static boolean allNine(char[] ch) {
		// returns true if all char are 9
		// boolean yes = true;
		for (int i = 0; i < ch.length; i++) {
			if ((ch[i]) != '9') {
				return false;
			}
		}
		return true;
	}
	public static int compare(char []ch1, char []ch2) {
		// if ch1.len < ch2.len -> return -1 
		// else                               compare([2, 1, 3, 3], [2, 1, 1, 2])
		// ch1 -> cur and ch2 -> palin
		if (ch1.length > ch2.length) return -1;
		else if (ch2.length > ch1.length) return 1;
		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] > ch2[i]) return -1;			// ori is > palin
			else if (ch1[i] < ch2[i]) return 1; // orriginal is less then palindrome
		}
		return 0;	// number are same
	}
	public static char[] findNextPalindrome(char []curInput) {
		// this will store palindrome
		char[] palin;
		if (allNine(curInput)) {
			// if all are nine
			palin = new char[curInput.length + 1];
			// filling all the elements with 0
			Arrays.fill(palin, '0');
			// making the first element 1
			// making the last element 1
			palin[0] = '1';
			palin[curInput.length] = '1';
			return palin;
		}
			// if all the chars are not 9
			// increment the middle char 
		int i = 0, j = curInput.length - 1;  // 2 1 3 3
		palin = new char[curInput.length];  // palin => [2, 2, 2, 2]
		// make the first one equal to second
		//cur->   12131
		//palin-> 12121 
		while (i <= j) {
			palin[i] = palin[j] = curInput[i];
			i++;
			j--;
		}
			// move to middle
			
			// compare this with original num
		if (compare(curInput, palin) <= 0) {	// if both are equal or current is greater then palin
			i--;	// go back one step
			j++;	 
			while (i >= 0) {
				if (palin[i] < '9') {
					palin[j] = ++palin[i];
					break;
				}else if (palin[i] == '9'){
					palin[i] = palin[j] = '0';
				}
				i--;
				j++;
			}
			}
			return palin;
		
		
	}
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		while (T-- > 0) {
			String s = bf.readLine();
			// trim zeroes
			String str;
			int i = 0;
			while (i < s.length() && s.charAt(i) == '0') {
				i++;
			} 
			StringBuilder sb = new StringBuilder(s);
			sb.replace(0, i, "");
			char ch[] = sb.toString().toCharArray();        // 2133
			char[] nxtPalin = findNextPalindrome(ch);
			//for (int j = 0; j < nxtPalin.length; j++)
			System.out.println(String.valueOf(nxtPalin));
			//System.out.println();
		}
	}
}