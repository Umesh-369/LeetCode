class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        char[] ch=new char[n+m];
        int left=0;
        int right=0;
        int index=0;
        while(left<n && right<m){
            if(index%2==0){
                ch[index++]=word1.charAt(left);
                left++;
            }
            else{
                ch[index++]=word2.charAt(right);
                right++;
            }
        }
        while(left<n){
            ch[index++]=word1.charAt(left);
            left++;
        }
        while(right<m){
            ch[index++]=word2.charAt(right);
            right++;
        }
        return new String(ch);
    }
}