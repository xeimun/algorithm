import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int i = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (i < arr.length) {
            if (list.isEmpty()) {
                list.add(arr[i]);
                i++;
            } else if (list.get(list.size() - 1) == arr[i]) {
                list.remove(list.size() - 1);
                i++;
            } else {
                list.add(arr[i]);
                i++;
            }
        }
        int[] stk = new int[list.size()];
        for (int j = 0; j < stk.length; j++) {
            stk[j] = list.get(j);
        }
        return stk.length == 0 ? new int[]{-1} : stk;
    }
}