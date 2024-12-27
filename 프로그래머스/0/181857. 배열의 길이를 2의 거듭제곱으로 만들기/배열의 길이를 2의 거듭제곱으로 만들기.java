import java.util.*;
import java.util.stream.*;class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int power = 1;
        while (power < len) {
            power *= 2;
        }
        if (power == len) {
            return arr;
        }
        return Arrays.copyOf(arr, power);
    }
}