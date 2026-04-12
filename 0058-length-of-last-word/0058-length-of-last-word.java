class Solution {
    public int lengthOfLastWord(String s) {
        String[] str=s.split(" ");
        int count=0;
        String word=str[str.length-1];
        for(int i=0;i<word.length();i++){
            count++;
        }
        return count;
    }
}