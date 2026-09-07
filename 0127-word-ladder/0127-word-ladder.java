class Solution {
    public int ladderLength(String beginword, String endWord, List<String> wordList) {
        Queue<String> q=new LinkedList<>();
        Set<String> set=new HashSet<>(wordList);
         if(!set.contains(endWord))return 0;
        q.add(beginword);
        set.remove(beginword);

        int level=1;
        while(!q.isEmpty()){ 
           int size=q.size();
           for(int k=0;k<size;k++){
            String word=q.poll();

            if(word.equals(endWord)){
                return level;
            }
             char[] arr=word.toCharArray();
            for(int i=0;i<word.length();i++){
                char original=arr[i];

                for(char ch='a';ch<='z';ch++){
                    if(original==ch){
                        continue;
                    }

                    arr[i]=ch;
                    String newword=new String(arr);
                    if(set.contains(newword)){
                        q.add(newword);
                        set.remove(newword);
                    }
                }
              arr[i]=original;
             }
           }
           level++;
        }
       return 0;
    }
}