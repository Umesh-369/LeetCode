class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int[] arr=new int[3];
        for(int i=0;i<n;i++){
            arr[nums[i]]++;
        } 
        int z=arr[0]; 
        int o=arr[1];
        int t=arr[2];

        for(int i=0;i<z;i++){
            nums[i]=0;
        }
        for(int i=z;i<n-t;i++){
            nums[i]=1;
        }
        for(int i=o+z;i<n;i++){
            nums[i]=2;
        }
    }
}