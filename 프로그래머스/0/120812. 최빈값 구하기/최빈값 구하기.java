import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(int[] array) {
        Map<Integer, Long> map = Arrays.stream(array)
                                       .boxed()
                                       .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        long max = 0;
        for (long l : map.values()) {
            if (l > max) {
                max = l;
            }
        }

        List<Integer> answer = new ArrayList<>();
        for(Integer i : map.keySet()) {
            if (map.get(i) == max) {
                answer.add(i);
            }
        }
        
        if(answer.size() != 1){
            return -1;
        }

        return answer.get(0);
    }
}