class Solution {
    public static int lastoccurence(int[] nums,int target){
        int n=nums.length;
        int left=0;
        int right=n-1;
        int lastoccur=-1;
        while(left<=right){
            int mid=(left+right)/2;

            if(nums[mid]==target){
                lastoccur=mid;
                left=mid+1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return lastoccur;
    }

   public static int firstoccurence(int[] nums,int target){
     int left=0;
     int right=nums.length-1;
     int firstoccur=-1;
     while(left<=right){
        int mid=(left+right)/2;
        if(nums[mid]==target){
            firstoccur=mid;
            right=mid-1;
        }
        else if(nums[mid]<target){
            left=mid+1;
        }
        else{
            right=mid-1;
        }
     }
        return firstoccur;
     }
   

    public int[] searchRange(int[] nums, int target) {
        int first=firstoccurence(nums,target);
        int last=lastoccurence(nums,target);

        return new int[]{first,last};
    }
}