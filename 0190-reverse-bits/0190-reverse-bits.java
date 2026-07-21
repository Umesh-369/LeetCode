class Solution {
    public int reverseBits(int n) {
       String bin=Integer.toBinaryString(n);
       while(bin.length()<32){
        bin="0"+bin;
       }

       char[] ch=bin.toCharArray();
       int left=0;
       int right=ch.length-1;
       while(left<=right){
         char temp=ch[left];
         ch[left]=ch[right];
         ch[right]=temp;
         left++;
         right--;
       } 
       String res=new String(ch);
       int ans=Integer.parseInt(res,2);
       return ans;
    }
}