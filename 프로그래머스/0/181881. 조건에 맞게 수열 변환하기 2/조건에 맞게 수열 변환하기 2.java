import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        while (true) {
            int[] tmp = Arrays.copyOf(arr, arr.length);

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0 && arr[i] >= 50) {
                    arr[i] = arr[i] / 2;
                    continue;
                }
                if (arr[i] % 2 != 0 && arr[i] < 50) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }

            if (Arrays.equals(arr, tmp)) {
                break;
            }
            answer++;
        }
        return answer;
    }
}