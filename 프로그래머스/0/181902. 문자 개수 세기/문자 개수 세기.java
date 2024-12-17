class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        int len = my_string.length();
        for (int i = 0; i < len; i++) {
            char tmp = my_string.charAt(i);
            if (Character.isUpperCase(tmp)) {
                answer[tmp - 'A']++;
            }else{
                answer[tmp - 'a' + 26]++;
            }
        }
        return answer;
    }
}