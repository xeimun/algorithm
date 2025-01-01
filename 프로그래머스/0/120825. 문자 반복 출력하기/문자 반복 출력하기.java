class Solution {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        String[] arr = my_string.split("");
        for (String str : arr) {
            answer.append(str.repeat(n));
        }
        return answer.toString();
    }
}