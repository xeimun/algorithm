import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dices = {a, b, c, d};
        Map<Integer, Integer> count = new HashMap<>();
        for (int dice : dices) {
            count.put(dice, count.getOrDefault(dice, 0) + 1);
        }

        if (count.size() == 1) {
            return 1111 * a;
        }
        if (count.size() == 2) {
            List<Integer> keys = new ArrayList<>(count.keySet());
            int p = keys.get(0);
            int q = keys.get(1);

            if (count.get(p) == 3) {
                return (int) Math.pow(10 * p + q, 2);
            }
            if (count.get(p) == 1) {
                return (int) Math.pow(10 * q + p, 2);
            }
            if (count.get(p) == 2) {
                return (p + q) * Math.abs(p - q);
            }
        }
        if (count.size() == 3) {
            List<Integer> keys = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
                if (entry.getValue() == 2) {
                    continue;
                }
                keys.add(entry.getKey());
            }
            return keys.get(0) * keys.get(1);
        }
        return Math.min(Math.min(a, b), Math.min(c, d));
    }
}