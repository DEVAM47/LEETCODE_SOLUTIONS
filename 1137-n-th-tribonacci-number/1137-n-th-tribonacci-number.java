class Solution {
    int fibbo(int n,int[] dp){
        if(n==0 ) return 0;
        if(n==1 || n==2) return 1;
        if(dp[n]!=0) return dp[n];
        dp[n]=fibbo(n-1,dp)+fibbo(n-2,dp)+fibbo(n-3,dp);
        return dp[n];
    }
    public int tribonacci(int n) {
        int[] dp=new int[n+1];
       return fibbo(n,dp);
        
    }
}