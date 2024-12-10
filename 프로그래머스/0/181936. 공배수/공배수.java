class Solution {
    public int solution(int number, int n, int m) {
        boolean isMultipleN = number % n == 0;
        boolean isMultipleM = number % m == 0;
        
        if(isMultipleN && isMultipleM){
            return 1;
        }
        
        return 0;
    }
}