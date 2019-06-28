class MinClimbing_746 {
    public static int minCost(int []cost, int n, int []dp) {
        if (n <= 0) return 0;
        if (n == 1) return 0;
        if (dp[n]!=0) return dp[n];
        dp[n] = Math.min(cost[n-1] + minCost(cost, n-1, dp), cost[n-2] +  minCost(cost, n-2, dp));
        return dp[n];
    }
    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int []dp = new int[n+1];
        return minCost(cost, n, dp);
    }
    public static void main(String []args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = bf.readLine();
        // cost 
        int []cost = new int[n];
        String st[] = bf.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            cost[i] = Integer.parseInt(st[i]);
        }
        int ans = minCostClimbingStairs(cost);
    }
    
}