class Solution {
    public int solution(int n, String control) {
        int answer = n;
        char[] controls = control.toCharArray();
        for (int i = 0; i < controls.length; i++) {
            answer += switch (controls[i]) {
                case 'w' -> 1;
                case 's' -> -1;
                case 'd' -> 10;
                case 'a' -> -10;
                default -> 0;
            };
        }
        return answer;
    }
}