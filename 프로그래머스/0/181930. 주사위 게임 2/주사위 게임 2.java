class Solution {
    public int solution(int a, int b, int c) {
        int equalCount = 0;
        if(a == b){
            equalCount++;
        } 
        if(b == c){
            equalCount++;
        } 
        if(c == a){
            equalCount++;
        }
        if(equalCount > 1){
            return (int) ((a + b + c) * (Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2)) * (Math.pow(a,3) + Math.pow(b,3) + Math.pow(c,3)));
        }
        if(equalCount == 1){
            return (int) ((a + b + c) * (Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2)));
        }
        return a + b + c;
}
}