import java.util.Arrays;
class Solution {
    public int solution(int[] num_list) {
        int product = Arrays.stream(num_list)
                            .reduce(1, (a, b) -> a * b);
        int sum = Arrays.stream(num_list)
                        .sum();

        return product < sum * sum ? 1 : 0;
    }
}