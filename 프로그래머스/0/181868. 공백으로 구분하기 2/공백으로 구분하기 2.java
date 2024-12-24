import java.util.*;
class Solution {
   public String[] solution(String my_string) {
        String[] arr = my_string.split(" ");
        return Arrays.stream(arr)
                     .filter(s -> !s.isBlank())
                     .toArray(String[]::new);
    }
}