import java.util.*;
import java.util.stream.*;
class Solution {
     public String[] solution(String[] str_list) {
        int indexL = -1;
        int indexR = -1;
        for(int i = 0; i < str_list.length; i++) {
            if(str_list[i].equals("l")) {
                indexL = i;
                break;
            }
            if(str_list[i].equals("r")) {
                indexR = i;
                break;
            }
        }
        if (indexL != -1) {
            return Arrays.copyOfRange(str_list, 0, indexL);
        }
        if (indexR != -1) {
            return Arrays.copyOfRange(str_list, indexR + 1, str_list.length);
        }
        return new String[]{};
    }
}