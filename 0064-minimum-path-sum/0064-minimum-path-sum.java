class Solution {
    int memo[][];
    int solve(int i,int j,int[][] grid,int n,int m){
        if(memo[i][j]!=-1) return memo[i][j];
        if(i==n-1 && j==m-1) return grid[i][j];
        
        if(i==n-1){
                 return memo[i][j]=grid[i][j]+solve(i,j+1,grid,n,m);
        }
        else if(j==m-1){
            return memo[i][j]=grid[i][j]+solve(i+1,j,grid,n,m);
        }
        else{
            return memo[i][j]=grid[i][j]+Math.min(solve(i+1,j,grid,n,m),solve(i,j+1,grid,n,m));
        }
        }
    
    public int minPathSum(int[][] grid) {
       int m=grid[0].length;
       int n=grid.length;
       memo=new int[n][m];
 for (int[] row : memo) Arrays.fill(row, -1);
        return solve(0,0,grid,n,m);
    }
}