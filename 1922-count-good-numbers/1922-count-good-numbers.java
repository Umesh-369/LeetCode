class Solution {
    static long mod=1000000007;
    public int countGoodNumbers(long n) {
        long even=(n+1)/2;
        long odd=n/2;

        long ans=pow(5,even);
        ans=(ans*pow(4,odd))%mod;

        return (int)ans;
    }

    public long pow(long base,long exp){
        long result=1;

        while(exp>0){
            if(exp%2==1){
                result=(result*base)%mod;
            }
                base=(base*base)%mod;
                exp=exp/2;
        }
        return result;
    }
}