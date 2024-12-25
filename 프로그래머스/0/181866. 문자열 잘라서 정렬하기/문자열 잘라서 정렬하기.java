import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.split("x");
        return Arrays.stream(arr)
                     .filter(i -> !i.isBlank())
                     .sorted()
                     .toArray(String[]::new);
    }
}