class Solution {
    public int solution(int a, int b) {
        String concatAB = String.valueOf(a) + String.valueOf(b);
        int numAB = Integer.parseInt(concatAB);
        int num2AB = 2  * a * b;
        
        return Math.max(numAB, num2AB);
    }
}