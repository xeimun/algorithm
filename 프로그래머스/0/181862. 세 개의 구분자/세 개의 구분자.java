import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        String[] arr = myStr.split("a|b|c");
        String[] answer = Arrays.stream(arr).filter(i->!i.isEmpty()).toArray(String[]::new);
        return answer.length == 0 ? new String[]{"EMPTY"} : answer;
    }
}