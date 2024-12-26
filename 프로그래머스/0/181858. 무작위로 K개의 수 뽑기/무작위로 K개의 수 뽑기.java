import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
class Solution {
   public int[] solution(int[] arr, int k) {
        List<Integer> tmp = Arrays.stream(arr)
                                  .distinct()
                                  .boxed()
                                  .collect(Collectors.toList());
        while (tmp.size() < k) {
            tmp.add(-1);
        }
        return IntStream.range(0, k)
                        .map(i -> tmp.get(i))
                        .toArray();
    }
}