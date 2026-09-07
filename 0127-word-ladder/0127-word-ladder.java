class Solution {
    public int ladderLength(String beginword, String endWord, List<String> wordList) {
        Queue<pair<String,Integer>> q=new LinkedList<>();
        Set<String> set=new HashSet<>(wordList);

        q.add(new pair<>(beginword,1));
        set.remove(beginword);

        while(!q.isEmpty()){
          String word=q.peek().getkey();
          int steps=q.peek().getvalue();
          q.poll();

          if(word.equals(endWord)){
            return steps;
          }

          for(int i=0;i<word.length();i++){
           char[] arr=word.toCharArray();
            char original=arr[i];
          for(char ch='a';ch<='z';ch++){
            arr[i]=ch;
            String newword=new String(arr);
            if(set.contains(newword)){
                set.remove(word);
                q.add(new pair<>(newword,steps+1));
             }
           }
          arr[i]=original;
          }
        }
       return 0;
    }
    class pair<k,v>{
        private k key;
        private v value;
        pair(k key,v value){
            this.key=key;
            this.value=value;
        }
     
      public k getkey(){
        return key;
      }

      public v getvalue(){
        return value;
      }
    }
}