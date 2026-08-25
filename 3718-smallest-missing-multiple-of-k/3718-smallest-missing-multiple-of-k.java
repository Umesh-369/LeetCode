class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();

        int n=nums.length;
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }

        int ans=0;
        int temp=k;
        int i=1;
        while(true){
           temp=k*i;
           if(!set.contains(temp)){
            ans=temp;
            break;
           }
           i++;
        }
        return ans;
    }
}