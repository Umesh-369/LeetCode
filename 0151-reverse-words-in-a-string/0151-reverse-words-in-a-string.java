class Solution {
    public String reverseWords(String s) {
      String[] arr=s.trim().split("\\s+");
      StringBuilder sb=new StringBuilder();
      int n=arr.length;
      for(int i=0;i<n/2;i++){
        String temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
      }

      for(int i=0;i<n;i++){
        sb.append(arr[i]);
        if(i<n-1){
            sb.append(" ");
        }
      }
      return sb.toString();
    }
}