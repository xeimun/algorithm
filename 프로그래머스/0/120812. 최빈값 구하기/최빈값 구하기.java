import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(int[] array) {
        int maxCount = 0;
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int number : array) {
            int count = map.getOrDefault(number, 0) + 1;
            map.put(number, count);
            
            if (count > maxCount) {
                maxCount = count;
                answer = number;
            } else if (count == maxCount) {
                answer = -1;
            }
        }
        return answer;
    }
}