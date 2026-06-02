class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        Set<Integer> st=new HashSet<>();
        for(int i=0;i<n;i++){
            st.add(nums[i]);
        }

        int len=0;
        int count=1;
        for(int i:st){
            if(!st.contains(i-1)){
               count=1;

               while(st.contains(i+1)){
                i=i+1;
                count=count+1;
               }

            }
            len=Math.max(len,count);
        }
        return len;
    }
}