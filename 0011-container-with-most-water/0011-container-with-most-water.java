class Solution {
    public int maxArea(int[] height) {
     int n=height.length;
     int left=0;
     int right=n-1;
     int capacity=0;
     while(left<right){
        int left_h=height[left];
        int right_h=height[right];
        int min_h=Math.min(left_h,right_h);
        int width=right-left;

        capacity=Math.max(capacity,min_h*width);
        if(left_h<=right_h){
            left++;
        }
        else{
            right--;
        }

     }   

     return capacity;
    }
}