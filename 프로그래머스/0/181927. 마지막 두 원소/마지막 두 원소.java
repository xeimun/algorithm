import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        int n = num_list[num_list.length - 1];
        int m = num_list[num_list.length - 2];
        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);

        answer[answer.length - 1] = n > m ?  n - m : 2 * n;

        return answer;
    }
}