import java.math.*;
class Solution {
    public String solution(String a, String b) {
        BigDecimal c = new BigDecimal(a);
        BigDecimal d = new BigDecimal(b);
        return String.valueOf(c.add(d));
    }
}