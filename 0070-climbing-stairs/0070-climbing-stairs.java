class Solution {

    // int helperRec(int n ,int[] dp){
    //     if( n == 1) return 1;
    //     if (n == 2) return 2;
        // if(dp[n] != -1){
        //     return dp[n];
        // }
        // dp[n] = helperRec(n-1,dp) + helperRec(n-2 ,dp);
        // return dp[n];

    // buttom up aproch


    // }    
   
    public int climbStairs(int n) { // n =2
        if (n == 0) return 0;
        if (n == 1) return 1;
        int[] dp = new int[n+1];
        // Arrays.fill(dp, -1);
        dp[1] =1;
        dp[2]=2;
        // return helperRec(n,dp);    
        for (int i=3 ;i<=n ;i++) {
            dp[i] =dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}