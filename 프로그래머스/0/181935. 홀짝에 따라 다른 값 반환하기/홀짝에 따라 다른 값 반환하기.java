import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        if(n % 2 == 0){
            return IntStream.rangeClosed(1,n).filter(i -> i % 2 == 0).map(i -> i*i).sum();
        }
    
        return IntStream.rangeClosed(1,n).filter(i -> i % 2 != 0).sum();
    }
}