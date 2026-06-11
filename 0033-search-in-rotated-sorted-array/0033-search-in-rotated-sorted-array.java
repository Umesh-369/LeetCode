class Solution {
    public int search(int[] nums, int target) {
      int n=nums.length;
      int low=0;
      int high=nums.length-1;
      int ans=-1;
      while(low<=high){
        int mid=(low+high)/2;
        if(nums[mid]==target){
           ans=mid;
           break;
        }
         
        //  left half is sorted or not
        if(nums[low]<=nums[mid]){
        // check whether target exist in left part
           if(nums[low]<=target && target<nums[mid]){
              high=mid-1;
           } 
           else{
            low=mid+1;
           }
        }
       else{
        // right part is sorted
         if(nums[mid]<target && target<=nums[high]){
            low=mid+1; 
         }
         else{
            high=mid-1;
         }
       }
        
      }
      return ans;
    }
}