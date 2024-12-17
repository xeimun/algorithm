import java.util.*;
class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();
        int len = my_string.length();

        for (int i = 0; i < len / m; i++) {
            int index = i * m + (c - 1);
            char str = my_string.charAt(index);
            answer.append(str);
        }

        return answer.toString();
    }
}