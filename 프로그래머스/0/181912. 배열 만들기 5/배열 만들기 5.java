import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        return Arrays.stream(intStrs)
                     .map(i -> i.substring(s, s + l))
                     .mapToInt(Integer::parseInt)
                     .filter(i -> i > k)
                     .toArray();
    }
}