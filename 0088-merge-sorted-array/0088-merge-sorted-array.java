class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int len=m+n;
      int left=0;
      int right=0;
      int[] res=new int[len];
      int ind=0;
      while(left<m && right<n){
        if(nums1[left]<nums2[right]){
            res[ind]=nums1[left];
            ind++;
            left++;
        }
        else{
            res[ind]=nums2[right];
            ind++;
            right++;
        }
      }
      while(left<m){
        res[ind++]=nums1[left];
        left++;
      }

      while(right<n){
        res[ind++]=nums2[right];
        right++;
      }
   
      for(int i=0;i<n+m;i++){
        nums1[i]=res[i];
      }
    }
}