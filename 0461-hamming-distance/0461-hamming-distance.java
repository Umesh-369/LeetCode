class Solution {
    public int hammingDistance(int x, int y) {
      int ans=x^y;
      int count=0;
      String bin=Integer.toBinaryString(ans);
      for(int i=0;i<bin.length();i++){
        if(bin.charAt(i)=='1'){
            count++;
        }
      }
      return count;
    }
}