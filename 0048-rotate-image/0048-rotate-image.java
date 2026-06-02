class Solution {
    public void reverse(int[] arr){
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
    }
    public void rotate(int[][] mat) {
      int m=mat.length;
      int n=mat[0].length;
      for(int i=0;i<=m-2;i++){
        for(int j=i+1;j<=n-1;j++){
            int temp=mat[i][j];
            mat[i][j]=mat[j][i];
            mat[j][i]=temp;
        }
      }

      for(int i=0;i<m;i++){
         reverse(mat[i]);
      }
    }
}