class Solution {
    public int solution(String myString, String pat) {
        int myStringLen = myString.length();
        int patLen = pat.length();
        int answer = 0;

        for (int i = 0; i < myStringLen - patLen + 1; i++) {
            String tmp = myString.substring(i, i + patLen);
            if (tmp.equals(pat)) {
                answer++;
            }
        }

        return answer;
    }
}