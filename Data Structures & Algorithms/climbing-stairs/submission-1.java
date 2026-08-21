class Solution {
    public int climbStairs(int n) {
        int one = 1, two = 1;
        for(int i=0;i<n-1;i++){
            int temp = one;
            one = one + two;
            two = temp;
        }
        return one;
        // if(n <= 2) return n;
        // int[] dp = new int[n+1];
        // dp[1] = 1;
        // dp[2] = 2;
        // for(int i=3;i<=n;i++){
        //     dp[i] = dp[i-1] + dp[i-2];
        // }
        // return dp[n];
        // int[] arr = new int[n];
        // if(n == 1) return 1;
        // if(n == 2) return 2;
        // arr[0] = 1;
        // arr[1] = 2;
        // for(int i=2;i<n;i++){
        //     arr[i] = arr[i-1] + arr[i-2];
        // }
        // return arr[n-1];
        
    }
}
