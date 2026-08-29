class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        Queue<int[]> rotten=new LinkedList<>();
        int total=0;
        int count=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               
                if(grid[i][j]!=0){
                    total++;
                }

                if(grid[i][j]==2){
                   rotten.add(new int[]{i,j});
                }
            }
        }

        int[] dx={-1,0,1,0};
        int[] dy={0,1,0,-1};

        int days=0;
        while(!rotten.isEmpty()){
           int k=rotten.size();
           count+=k;

           for(int i=0;i<k;i++){
             int[] pos=rotten.poll();
             int x=pos[0];
             int y=pos[1];

             for(int j=0;j<4;j++){
                 int nx=x+dx[j];
                 int ny=y+dy[j];

                 if(nx<0 || nx>=m || ny<0 || ny>=n || grid[nx][ny]!=1){
                    continue;
                 }

                 grid[nx][ny]=2;
                 rotten.add(new int[]{nx,ny} );
             }
           }
             if(!rotten.isEmpty()){
                days++;
             }
        }
         return total==count?days:-1;
    }
}