class Solution {
    public String solution(String my_string, int s, int e) {
        String str = my_string.substring(s, e + 1);
        StringBuilder reversedStr = new StringBuilder(str).reverse();
        return my_string.replace(str, reversedStr);
    }
}