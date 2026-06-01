class Solution {
    public int[] rearrangeArray(int[] nums) {
         int n=nums.length;
         int n1=n/2;
         int[] pos=new int[n1];
         int[] neg=new int[n1];
         int ind1=0;
         int ind2=0;
         for(int i=0;i<n;i++){
            if(nums[i]>0){
                pos[ind1]=nums[i];
                ind1++;
            }
            else{
                neg[ind2]=nums[i];
                ind2++;
            }
         }

         ind1=0;
         ind2=0;
         for(int i=0;i<n;i++){
            if(i%2==0){
                nums[i]=pos[ind1];
                ind1++;
            }
            else{
                nums[i]=neg[ind2];
                ind2++;
            }
         }
         return nums;
    }
}