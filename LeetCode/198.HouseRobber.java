/*
    Using Memoization Techique of Dynamic Programming
    LeetCode 198. House Robber

*/
class Solution {
    public int rob(int []nums, int i, int []dp) {
        int len = nums.length-1;
        if (i > len) return 0;
        if (i == len) dp[i] = nums[i];
        if (dp[i] != -1) return dp[i];
        dp[i] = Math.max(nums[i] + rob(nums, i+2, dp), rob(nums, i+1, dp));
        return dp[i];
    }
    public int rob(int[] nums) {
        // given the amt of money, rob to get max money
        int len = nums.length; // length of nums array
        int []dp = new int[len];
        Arrays.fill(dp, -1);
        return rob(nums, 0, dp);
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int []nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = kb.nextInt();
        }
        int ans = rob(nums);
        System.out.println(ans);
    }
}