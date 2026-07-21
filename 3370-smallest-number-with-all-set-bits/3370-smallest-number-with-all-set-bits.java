class Solution {
    public int smallestNumber(int n) {
     String bin=Integer.toBinaryString(n);
     char[] ch=bin.toCharArray();
     for(int i=0;i<ch.length;i++){
        if(ch[i]=='0'){
            ch[i]='1';
        }
     }   
     String ans=new String(ch);
     int res=Integer.parseInt(ans,2);
     return res;
    }
}