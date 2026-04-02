class Solution {
     int dfs(int[][] mat,int i,int j){
        int r=mat.length;
        int c=mat[0].length;
        if(i<0 || i>=r || j<0 || j>=c){
            return 1;
        }
           if(mat[i][j] == 0){
            return 1;
        }

        if(mat[i][j] == -1){
            return 0;
        }

        mat[i][j] = -1;
        // top
        int per=0;
        per+=dfs(mat,i-1,j);
        // right
        per+=dfs(mat,i,j+1);
        // down
        per+=dfs(mat,i+1,j);
        // left
        per+=dfs(mat,i,j-1);

        return per;
     }
    public int islandPerimeter(int[][] grid) {
       
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                   return dfs(grid,i,j);
            
                }
            }
        }
        return 0;
    }
}