class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder answer = new StringBuilder();
        int len = code.length();
        
        while(r < len){
            char str = code.charAt(r);
            answer.append(str);
            r += q;
        }

        return answer.toString();
    }
}