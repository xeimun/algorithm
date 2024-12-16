import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        StringBuilder str = new StringBuilder(my_string);
        answer[0] = my_string;
        int len = my_string.length();

        for (int i = 1; i < len; i++) {
            str.deleteCharAt(0);
            answer[i] = str.toString();
        }

        Arrays.sort(answer);
        return answer;
    }
}