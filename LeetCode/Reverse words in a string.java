/*
	LeetCode Solution
	Space Complexity - O(1)
	Time Complexity - O(N*W)
	N -> Length of given string s
	W -> Length of words in a string s 
	Worst Case -> O(N^2)   
*/
class Solution {
    public String reverse(String s) {
        char[] ch = s.toCharArray();
        int i = 0, j = ch.length-1;
        while (i < j) {
            char c1= ch[i];
            ch[i] = ch[j];
            ch[j] = c1;
            i++;
            j--;
        }
        return new String(ch);
    }
    public String reverseWords(String s) {
        String st[] = s.split(" ");
        StringBuilder str = new StringBuilder(); // empty string
        for (String st1 : st) {
            str.append(reverse(st1)+" "); // s'teL
        }
        String ans = str.toString().trim();
        return ans;
    }
}