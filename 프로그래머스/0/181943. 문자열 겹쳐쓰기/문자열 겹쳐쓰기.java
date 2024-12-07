class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
    
        char[] myStringArr = my_string.toCharArray();
        char[] overwriteStringArr = overwrite_string.toCharArray();
        
        for (int i = 0; i < overwriteStringArr.length; i++) {
            myStringArr[s + i] = overwriteStringArr[i];
        }
        
        return new String(myStringArr);
    }
}