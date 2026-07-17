class Solution {
    public int findClosestNumber(int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int diff=0;
        int ans=nums[0];
        for(int i=0;i<n;i++){
           if(Math.abs(nums[i])<Math.abs(ans)){
            ans=nums[i];
           }
           else if(Math.abs(nums[i])==Math.abs(ans) && nums[i]>ans){
            ans=nums[i];
           }
    
        }

        return ans;
    }
}