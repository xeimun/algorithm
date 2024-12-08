class Solution {
    public int solution(int a, int b) {
        String concatAB = String.valueOf(a) + String.valueOf(b);
        String concatBA = String.valueOf(b) + String.valueOf(a);
        
        int numAB = Integer.parseInt(concatAB);
        int numBA = Integer.parseInt(concatBA);
        
        return Math.max(numAB, numBA);
    }
}