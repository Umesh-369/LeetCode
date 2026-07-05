class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int even=0;
        int odd=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                  arr[even]=nums[i];
                  even+=2;
            }
            else{
                arr[odd]=nums[i];
                odd+=2;
            }
        }
        return arr;
    }
}