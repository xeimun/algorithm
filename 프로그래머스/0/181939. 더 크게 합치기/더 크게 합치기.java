class Solution {
    public int solution(int a, int b) {
        String concatAB = String.valueOf(a) + String.valueOf(b);
        String concatBA = String.valueOf(b) + String.valueOf(a);
        
        int numAB = Integer.valueOf(concatAB);
        int numBA = Integer.valueOf(concatBA);
        
        return Math.max(numAB, numBA);
    }
}