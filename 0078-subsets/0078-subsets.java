class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        int ans=0;
        int subsets=1<<n;
        List<List<Integer>> arr=new ArrayList<>();
        for(int i=0;i<subsets;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i & (1<<j))!=0){
                   row.add(nums[j]);
                }
            }
            arr.add(row);
        }
        return arr;
    }
}