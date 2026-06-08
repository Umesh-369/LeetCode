class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left=0;
        int right=0;
        int[] arr=new int[m+n];
        int index=0;
         while(left<m && right<n){
            if(nums1[left]<=nums2[right]){
                arr[index]=nums1[left];
                index++;
                left++;
            }
            else{
               arr[index]=nums2[right];
               right++;
               index++;
            }
         }

         while(left<m){
            arr[index++]=nums1[left];
            left++;
         }
         while(right<n){
            arr[index++]=nums2[right];
            right++;
         }
         
         for(int i=0;i<m+n;i++){
             nums1[i]=arr[i];
         }
        
    }
}