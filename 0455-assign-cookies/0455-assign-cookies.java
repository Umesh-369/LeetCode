class Solution {
    public int findContentChildren(int[] g, int[] s) {
       int m=g.length;
       int n=s.length;
       int child=0;
       int cookie=0;
       Arrays.sort(g);
       Arrays.sort(s);
       while(child<m && cookie<n){
         
         if(s[cookie]>=g[child]){
            child++;
         }
         cookie++;
       } 
       return child;
    }
}