class Solution {
    public int solution(int a, int b) {
        
        int numAB = Integer.parseInt("" + a + b);
        int numBA = Integer.parseInt("" + b + a);
        
        return Math.max(numAB, numBA);
    }
}