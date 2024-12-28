import java.util.*;
import java.util.stream.*;
class Solution {
   public int solution(int[] rank, boolean[] attendance) {
        List<Integer> list = IntStream.range(0, rank.length)
                                      .filter(i -> attendance[i])
                                      .boxed()
                                      .sorted(Comparator.comparingInt(i -> rank[i]))
                                      .limit(3)
                                      .collect(Collectors.toList());
        int a = list.get(0);
        int b = list.get(1);
        int c = list.get(2);

        return 10000 * a + 100 * b + c;
    }
}