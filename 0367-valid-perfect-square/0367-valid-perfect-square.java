class Solution {
    public boolean isPerfectSquare(int num) {
       long start=0;
       long end=num;
       boolean ans=false;
       while(start<=end){
            long mid=start+(end-start)/2;

            if(mid*mid==num){
               ans=true;
               break;
            }
            else if(mid*mid<num){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
}