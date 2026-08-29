class Solution {
    public int findCircleNum(int[][] isConnected) {
       int n=isConnected.length;
       boolean[] visited=new boolean[n];

       int count=0;
       for(int i=0;i<n;i++){
        if(!visited[i]){
            dfs(i,isConnected,visited);
            count++;
        }
       }   
       return count;
    }


   public void dfs(int node,int[][] isConnected,boolean[] visited){
     int n=isConnected.length;
      visited[node]=true;
     for(int i=0;i<n;i++){
        if(!visited[i] && isConnected[node][i]==1){
            dfs(i,isConnected,visited);
        }
     }
   }
}