class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> st=new Stack<>();
        int n=temp.length;
        int count=0;
        int[] res=new int[n];
        for(int i=n-1;i>=0;i--){
           while(!st.isEmpty() && temp[st.peek()]<=temp[i]){
              st.pop();
           }
           if(st.isEmpty()){
            res[i]=0;
            count=0;
           }
           else{
            res[i]=Math.abs(i-st.peek());
           }
           count++;
           st.push(i);
        }
        return res;
    }
}