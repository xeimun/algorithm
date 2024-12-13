import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        answer.add(n);

        while (n > 1) {
            int tmp = n % 2 == 0 ? n / 2 : 3 * n + 1;
            answer.add(tmp);
            n = tmp;
        }

        return answer.stream()
                     .mapToInt(Integer::intValue)
                     .toArray();
    }
}