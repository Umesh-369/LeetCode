class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] visited=new int[m][n];
        int count=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && visited[i][j]==0){
                    dfs(grid,i,j,visited);
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(char[][] grid,int r,int c,int[][] visited){
        int m=grid.length;
        int n=grid[0].length;
        if(r<0 || r>=m || c<0 || c>=n || visited[r][c]==1 || grid[r][c]=='0')return ;
       
        grid[r][c]='0';
        visited[r][c]=1;
        dfs(grid,r-1,c,visited);
        dfs(grid,r,c+1,visited);
        dfs(grid,r+1,c,visited);
        dfs(grid,r,c-1,visited);
          
    }
}