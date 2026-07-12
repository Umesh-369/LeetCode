class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=arr[i];
        }
        Arrays.sort(arr);
        int rank=1;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(arr[i])){

            map.put(arr[i],rank++);
            }
        }
        for(int i=0;i<n;i++){
            res[i]=map.get(res[i]);
        }
        return res;
    }
}