class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((x,y)->{
             if(x>y){
                return -9;
             }
             else if(x<y){
                return 9;
             }
             else {
                return 0;
             }
        });

        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }

        for(int i=1;i<k;i++){
            pq.poll();
        }
        return pq.poll();
    }
}