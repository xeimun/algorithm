import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        return
        switch (n) {
            case 1 -> Arrays.copyOfRange(num_list, 0, b + 1);
            case 2 -> Arrays.copyOfRange(num_list, a, num_list.length);
            case 3 -> Arrays.copyOfRange(num_list, a, b + 1);
            case 4 -> IntStream.rangeClosed(a, b).filter(i -> (i-a) % c == 0).map(i->num_list[i]).toArray();
            default -> num_list;
        };
    }
}