class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Using HashMap
        // HashMap<Integer,Integer> map=new HashMap<>();
        // int n=nums.length;
        // for(int i=0;i<n;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }

        // for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        //     if(entry.getValue()>=2){
        //         return true;
        //     }
        // }
        // return false;

        // Using HashSet
        Set<Integer> st=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(st.contains(nums[i])){
                return true;
            }
            st.add(nums[i]);
        }
        return false;
    }
}