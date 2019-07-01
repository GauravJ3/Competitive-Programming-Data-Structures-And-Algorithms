import java.util.Scanner;
// Approach #1
// Using Kadane's Algorithm
// Time Complexity -> O(N)
class MaxSubarraySum_53 {
    public static int maxSubArray(int[] nums) {
        // check if all the elements are 0 or not
        int tmp = 0;
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) tmp++;
            if (nums[i] > max) max = nums[i];
        }
        if (tmp == nums.length) return max;
        int cur_sum = 0;
        int max_sum = 0;
        for (int i = 0; i < nums.length; i++) {
            cur_sum += nums[i];
            if (cur_sum > max_sum) max_sum = cur_sum;
            if (cur_sum < 0) cur_sum = 0;
        }
        return max_sum;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int []nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = kb.nextInt();
        }
        int ans = maxSubArray(nums);
        System.out.println(ans);
    }
}