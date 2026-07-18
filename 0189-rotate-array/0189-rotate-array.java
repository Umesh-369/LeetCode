class Solution {
    public void reverse(int[] arr,int start,int end){
      int left=start;
      int right=end-1;
      while(left<=right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
      }
    }
    
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;

        reverse(nums,0,n-k);

        reverse(nums,n-k,n);

        reverse(nums,0,n);
    }
}