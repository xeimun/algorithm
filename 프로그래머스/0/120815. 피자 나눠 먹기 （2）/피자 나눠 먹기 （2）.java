class Solution {
    public int solution(int n) {
        int a = 6;
        int b = n;
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        
        return (6 * n) / a / 6;
    }
}