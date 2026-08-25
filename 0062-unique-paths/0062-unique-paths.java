class Solution {
    public int path(int[][] dp,int row,int col){
        if(row==0 || col==0) return 1;
        if(dp[row][col]!=0) return dp[row][col];
        dp[row][col]=path(dp,row-1,col)+path(dp,row,col-1);
        return dp[row][col];
        
    }
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        return path(dp,m-1,n-1);
    }
}