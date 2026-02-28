class Solution {
    public int concatenatedBinary(int n) {
        long mod=1_000_000_007;
        long res=0;
        long length=0;
        for(int i=1;i<=n;i++){
            if((i&(i-1))==0){

                length++;
            }
            res=(res<<length)+i;
            res%=mod;
        }
        return (int) res;
    }
}