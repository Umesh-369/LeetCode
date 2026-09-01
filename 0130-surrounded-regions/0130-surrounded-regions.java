class Solution {
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;

        int[][] visited=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==m-1 || j==n-1 || j==0){
                    if(board[i][j]=='O'){
                    dfs(board,i,j,visited);
                    }
                }
            }
        }
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(board[i][j]=='O' && visited[i][j]==0){
                        board[i][j]='X';
                    }
                }
            }
        
    }

    public void dfs(char[][] board,int i,int j,int[][] visited){
       int m=board.length;
       int n=board[0].length;
       if(i<0 || i>=m || j<0 || j>=n || board[i][j]=='X' || visited[i][j]==1){
        return ;
       }

       visited[i][j]=1;
       dfs(board,i-1,j,visited);
       dfs(board,i,j+1,visited);
       dfs(board,i+1,j,visited);
       dfs(board,i,j-1,visited);
    }
}