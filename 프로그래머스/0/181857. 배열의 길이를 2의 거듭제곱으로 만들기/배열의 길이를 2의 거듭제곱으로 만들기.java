import java.util.*;
import java.util.stream.*;class Solution {
    public int[] solution(int[] arr) {
        int len = 1;
        while (len < arr.length) {
            len *= 2;
        }
        return Arrays.copyOf(arr, len);
    }
}