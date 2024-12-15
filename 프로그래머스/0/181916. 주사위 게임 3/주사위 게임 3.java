import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dices = {a, b, c, d};
        Arrays.sort(dices);

        a = dices[0];
        b = dices[1];
        c = dices[2];
        d = dices[3];

        return
        a == d ? 1111 * a :
        a == c ? (10 * c + d) * (10 * c + d) :
        b == d ? (10 * b + a) * (10 * b + a) :
        a == b && c == d ? (c + b) * (c - b) :
        a == b ? c * d :
        b == c ? a * d :
        c == d ? a * b :
        a;
    }
}