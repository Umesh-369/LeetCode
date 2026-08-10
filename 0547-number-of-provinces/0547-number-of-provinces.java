class Solution {
    
    public void dfs(int node,List<List<Integer>> graph,boolean[] visited){
    visited[node]=true;

    for(int neighbour:graph.get(node)){
        if(!visited[neighbour]){
          dfs(neighbour,graph,visited);
        }
    }
    }

    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        List<List<Integer>> graph=new ArrayList<>();

        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
            if(isConnected[i][j]==1 && i!=j){
                graph.get(i).add(j);
            }
          }
        }

        boolean[] visited=new boolean[n];
        int count=0;

        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i,graph,visited);
                count++;
            }
        }

        return count;
    }
}