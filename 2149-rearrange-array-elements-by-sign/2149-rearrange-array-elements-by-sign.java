class Solution {
    public int[] rearrangeArray(int[] nums) {
         int n=nums.length;
         int posind=0;
         int negind=1;
         int[] arr=new int[n];
         for(int i=0;i<n;i++){
            if(nums[i]<0){
                arr[negind]=nums[i];
                negind+=2;
            }
            else{
                arr[posind]=nums[i];
                posind+=2;
            }
         }
         return arr;
    }
}