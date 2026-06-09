class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
       int start=0;
       int end=n-1;
       while(start<=end){
         if(nums[start]<=nums[end]){
            min=Math.min(min,nums[start]);
            start++;
         }
         else{
            min=Math.min(min,nums[end]);
            end--;
         }
       }
       return min;
    }
}