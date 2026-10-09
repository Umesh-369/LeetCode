class Solution {

    public int solve(int[][] grid,int r,int c,int[][] dp){
        if(r<0 || c<0 )return 0;
        if(grid[r][c]==1)return 0;
        if(r==0 && c==0)return 1;
        if(dp[r][c]!=-1)return dp[r][c];

        int up=solve(grid,r-1,c,dp);
        int left=solve(grid,r,c-1,dp);

       dp[r][c]=left+up;
       return dp[r][c];
    }

    public int uniquePathsWithObstacles(int[][] Grid) {
        int m=Grid.length;
        int n=Grid[0].length;
   
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }

        return solve(Grid,m-1,n-1,dp);
    }
}