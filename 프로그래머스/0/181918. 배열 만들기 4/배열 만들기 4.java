import java.util.*;
class Solution {
public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        int i = 0;

        while (i < arr.length) {
            if (stk.isEmpty() || stk.get(stk.size() - 1) < arr[i]) {
                stk.add(arr[i]);
                i++;
                continue;
            }
            stk.remove(stk.size() - 1);
        }

        return stk.stream()
                  .mapToInt(Integer::intValue)
                  .toArray();
    }
}