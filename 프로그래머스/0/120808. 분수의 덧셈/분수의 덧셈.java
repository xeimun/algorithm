class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int num = (numer1 * denom2) + (numer2 * denom1);
        int den = denom1 * denom2;

        int tmp1 = num;
        int tmp2 = den;
        while (tmp2 != 0) {
            int remainder = tmp1 % tmp2;
            tmp1 = tmp2;
            tmp2 = remainder;
        }
        
        return new int[]{num / tmp1, den / tmp1};
    }
}