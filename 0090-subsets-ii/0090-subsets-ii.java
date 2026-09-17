class Solution {

    public void func(int index,int[] nums,Set<List<Integer>> result,List<Integer> arr){
       if(index==nums.length){
        result.add(new ArrayList<>(arr));
        return ;
       }
       arr.add(nums[index]);
       func(index+1,nums,result,arr);

       arr.remove(arr.size()-1);
       func(index+1,nums,result,arr);
       
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> result=new HashSet<>();
        List<Integer> arr=new ArrayList<>();
        Arrays.sort(nums);
        func(0,nums,result,arr);

        return new ArrayList<>(result);
    }
}