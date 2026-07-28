class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        int halflen=n/2;
        char[] lefthalf=s.substring(0,halflen).toCharArray();
       Arrays.sort(lefthalf);
       StringBuilder sb=new StringBuilder();
       sb.append(lefthalf);
       if(n%2!=0){
        sb.append(s.charAt(halflen));
       }

       for(int i=lefthalf.length-1;i>=0;i--){
        sb.append(lefthalf[i]);
       }
       return sb.toString();
    }
}