class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
       Arrays.sort(nums);
       int first=nums[n-1];
       int second=nums[n-2];
       return (first-1)*(second-1);
    }
}