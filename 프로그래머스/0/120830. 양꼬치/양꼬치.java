class Solution {
    public int solution(int n, int k) {
        int service = n / 10;
        int nPrice = n * 12_000;
        int kPrice = (k - service) * 2_000;
        return nPrice + kPrice;
    }
}