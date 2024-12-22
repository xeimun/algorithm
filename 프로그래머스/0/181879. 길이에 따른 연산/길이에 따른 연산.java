import java.util.*;
class Solution {
    public int solution(int[] num_list) {
        int len = num_list.length;
        int answer = 0;
        if (len > 10) {
            answer = Arrays.stream(num_list)
                           .sum();
        } else {
            answer = Arrays.stream(num_list)
                           .reduce(1, (x, y) -> x * y);
        }
        return answer;
    }
}