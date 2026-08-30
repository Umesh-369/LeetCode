class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int minindex=0;
        int maxindex=0;

        for(int i=0;i<n;i++){
            if(nums[i]<nums[minindex]){
                minindex=i;
            }
            if(nums[i]>nums[maxindex]){
                maxindex=i;
            }
        }

        int i=Math.min(minindex,maxindex);
        int j=Math.max(minindex,maxindex);

        int bothfront=j+1;

        int bothback=n-i;

        int frontend=(i+1)+(n-j);

        return Math.min(bothfront,Math.min(bothback,frontend));
    }
}