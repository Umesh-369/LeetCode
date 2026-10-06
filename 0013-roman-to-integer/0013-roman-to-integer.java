class Solution {
    public int romanToInt(String s) {
        // HashMap<Character,Integer> map=new HashMap<>();
        // map.put('I',1);
        // map.put('V',5);
        // map.put('X',10);
        // map.put('L',50);
        // map.put('C',100);
        // map.put('D',500);
        // map.put('M',1000);
        
        int n=s.length();
        int total=0;
        for(int i=0;i<n;i++){
            // int currentval=map.get(s.charAt(i));
              int currentval=solve(s.charAt(i));
            // if(i<n-1 && currentval< map.get(s.charAt(i+1))){
            if(i<n-1 && currentval< solve(s.charAt(i+1))){
               total=total-currentval;  
            }
            else{
              total=total+currentval;
            }
        }

        return total;
    }

    public int solve(char ch){
        switch (ch){
            case 'I':return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}