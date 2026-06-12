class Solution {
    public long hours(int[] arr,int mid){
        int n=arr.length;
        long ans=0;
        for(int i=0;i<n;i++){
           ans=ans+(int)Math.ceil((double)arr[i]/mid);
        }
        return ans;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int max=0;
        for(int i=0;i<n;i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }
        int ans=0;
        int low=1;
        int high=max;
        while(low<=high){
           int mid=(low+high)/2;
           long totalhours=hours(piles,mid);

           if(totalhours<=h){
            ans=mid;
            high=mid-1;
           }
           else{
            low=mid+1;
           }
        }
        return ans;
    }
}