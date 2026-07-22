class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> st=new Stack<>();
        int n=op.length;
       
        for(int i=0;i<n;i++){
            if(!op[i].equals("C") && !op[i].equals("D") && !op[i].equals("+")){
                st.push(Integer.parseInt(op[i]));
            }
            if(op[i].equals("C")){
                st.pop();
            }
           else if(op[i].equals("D")){

              st.push(st.peek()*2);
           }
           else if(op[i].equals("+")){
            int first=st.pop();
            int second=st.peek();
              st.push(first);
              st.push(first+second);
           }
        }
        int ans=0;
        while(!st.isEmpty()){
          int num=st.pop();
          ans=ans+num;
        }
        return ans;
    }
}