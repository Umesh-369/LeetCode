class Solution {
    public int minBitFlips(int start, int goal) {
        int ans=start^goal;
        int count=0;
        String bin=Integer.toBinaryString(ans);
        // for(int i=0;i<32;i++){
        //     if((ans & (1<<i))!=0){
        //         count++;
        //     }
        // }
        
        for(int i=0;i<bin.length();i++){
            if(bin.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
}