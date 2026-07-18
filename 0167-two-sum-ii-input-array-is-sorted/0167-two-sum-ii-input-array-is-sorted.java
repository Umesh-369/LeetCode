class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int left=0;
        int right=n-1;
        while(left<right){
            int mid=numbers[left]+numbers[right];
            if(mid==target){
                return new int[]{left+1,right+1};
            }
            else if(mid>target){
                right--;
            }
            else{
                left++;
            }
        }
        return new int[]{-1,-1};
    }
}