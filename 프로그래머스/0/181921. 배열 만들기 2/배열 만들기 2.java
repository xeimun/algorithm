import java.util.stream.IntStream;
class Solution {
    public int[] solution(int l, int r) {
        int[] answer = IntStream.rangeClosed(l, r)
                                .mapToObj(String::valueOf)
                                .filter(i -> i.matches("^[05]+$"))
                                .mapToInt(Integer::parseInt)
                                .toArray();

        return answer.length == 0 ? new int[]{-1} : answer;
    }
}