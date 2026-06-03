class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=numRows;
        
        for(int i=0;i<n;i++){
            int answer=1;
            List<Integer> temp=new ArrayList<>();
            temp.add(1);
            for(int j=1;j<=i;j++){
               answer=answer*(i-j+1);
               answer=answer/(j);
               temp.add(answer);
            }
            ans.add(temp);
        }
        return ans;
    }
}