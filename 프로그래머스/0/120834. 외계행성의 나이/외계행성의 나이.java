class Solution {
    public String solution(int age) {
        char[] alphabet = new char[26];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) ('a' + i);
        }
        StringBuilder answer = new StringBuilder();
        while (age > 0) {
            int tmp = age % 10;
            answer.append(alphabet[tmp]);
            age /= 10;
        }
        return answer.reverse()
                     .toString();
    }
}