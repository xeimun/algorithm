class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int index = 0;
        for (String str : picture) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                sb.append(String.valueOf(str.charAt(i)).repeat(k));
            }
            for(int j = 0; j < k; j++){
                answer[index++] = sb.toString();
            }
        }
        return answer;
    }
}