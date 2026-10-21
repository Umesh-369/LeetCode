class Solution {

   public int solve(int index,int[] nums,int[] dp){
    if(index==0)return nums[index];
    if(index<0)return 0;
    if(dp[index]!=-1)return dp[index];

    int pick=nums[index]+solve(index-2,nums,dp);
    int notpick=0+solve(index-1,nums,dp);
     
    dp[index]=Math.max(pick,notpick);
    return dp[index];
   }

    public int rob(int[] nums) {
    int n=nums.length;
    int[] dp=new int[n+1];
    Arrays.fill(dp,-1);   

    return solve(n-1,nums,dp);    
    }


}