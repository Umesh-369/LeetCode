class Solution {
    public int missingMultiple(int[] nums, int k) {
        ArrayList<Integer> li=new ArrayList<>();

        int n=nums.length;
        for(int i=0;i<n;i++){
            li.add(nums[i]);
        }

        int ans=0;
        int temp=k;
        int i=1;
        while(true){
           temp=k*i;
           if(!li.contains(temp)){
            ans=temp;
            break;
           }
           i++;
        }
        return ans;
    }
}