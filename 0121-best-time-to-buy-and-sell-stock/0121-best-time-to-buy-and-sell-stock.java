class Solution {
    public int maxProfit(int[] nums) {
        int n=nums.length;
        int maxprofit=0;
        int minprice=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
           if(nums[i]<minprice){
            minprice=nums[i];
           }
           else{
            maxprofit=Math.max(maxprofit,nums[i]-minprice);
           }
        }
        return maxprofit;
    }
}