class Solution {
    public String solution(String str1, String str2) {
        StringBuilder answer = new StringBuilder();
        
        char[] str1Arr = str1.toCharArray();
        char[] str2Arr = str2.toCharArray();
        
        for(int i = 0; i < str1Arr.length; i++){
            answer.append(str1Arr[i]);
            answer.append(str2Arr[i]);
        }
        
        return answer.toString();
    }
}