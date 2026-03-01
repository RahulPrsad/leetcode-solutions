class Solution {
    public int minPartitions(String n) {
        int max=n.charAt(0)-'0';
        for(char c:n.toCharArray()){
            if(c-'0'>max){
                max=c-'0';
            }
        }

        return max;
    }
}