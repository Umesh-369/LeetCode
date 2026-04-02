class Solution {
    void dfs(char[][] mat,int i,int j){
       int r=mat.length;
       int c=mat[0].length;

       if(i<0 || i>=r || j<0 || j>=c || mat[i][j]=='0'){
        return ;
       }
       mat[i][j]='0';
    //    top
    dfs(mat,i-1,j);
    // right
    dfs(mat,i,j+1);
    // down
    dfs(mat,i+1,j);
    // left
    dfs(mat,i,j-1);
    }

    public int numIslands(char[][] grid) {
       int count=0;
       for(int i=0;i<grid.length;i++){
         for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]=='1'){
                dfs(grid,i,j);
                count++;
            }
         }
       } 
       return count;
    }
}