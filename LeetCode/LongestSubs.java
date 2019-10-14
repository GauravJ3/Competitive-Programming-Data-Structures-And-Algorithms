/*
* Link :- https://leetcode.com/problems/longest-substring-without-repeating-characters/
*/
class LongestSubs {
    public static void main(String[] args) {
        String s1 = "abcabcbb";
        // O/P :- 3
        // Explaination :- The answer is "abc", with the length of 3
        String s2 = "bbbbbb";
        // O/P :- 1
        String s3 = "pwwkew";
        // O/P :- 3
        int l1 = lengthOfLongestSubstring(s1);
        int l2 = lengthOfLongestSubstring(s2);
        int l3 = lengthOfLongestSubstring(s3);
        System.out.println("lengthOfLongestSubstring for string " + s1 + " is " + l1);
        System.out.println("lengthOfLongestSubstring for string " + s2 + " is " + l2);
        System.out.println("lengthOfLongestSubstring for string " + s3 + " is " + l3);
    }
    public int len(int []ch) {
        int ans = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 1) ans++;
        }
        return ans;
    }
    public int lengthOfLongestSubstring(String s) {
        int []ch = new int[256];
        int ans = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            if (ch[s.charAt(i)] > 0) {
                i = start++;
                Arrays.fill(ch, 0);
                continue;
            }
            ch[s.charAt(i)]++;
            ans = Math.max(ans, len(ch));
        }
        return ans;
    }
}