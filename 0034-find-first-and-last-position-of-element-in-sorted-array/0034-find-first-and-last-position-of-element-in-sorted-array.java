class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int[] arr=new int[2];
        int start=0;
        int end=n-1;
        int res=-1;
        // first
        while(start<=end){
          int mid=start+(end-start)/2;
          if(nums[mid]==target){
            res=mid;
            end=mid-1;
          }
          else if(nums[mid]>target){
            end=mid-1;
          }
          else{
            start=mid+1;
          }
        }

        if(res==-1){
            return new int[]{-1,-1};
        }
        else{
            arr[0]=res;
        }
        int left=0;
        int right=n-1;
        // last
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                res=mid;
                left=mid+1;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        arr[1]=res;
       return arr;
    }
}