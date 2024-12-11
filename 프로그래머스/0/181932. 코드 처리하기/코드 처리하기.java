class Solution {
    public String solution(String code) {
        char mode = '0';
        StringBuilder ret = new StringBuilder();
        char[] codeCharArr = code.toCharArray();
        
        for(int i = 0; i < codeCharArr.length; i++){
            if(mode == '0'){
                if(codeCharArr[i] == '1'){
                    mode = '1';
                    continue;
                } 
                if(i % 2 == 0){
                   ret.append(codeCharArr[i]); 
                }
            }
           if(mode == '1'){
                if(codeCharArr[i] == '1'){
                    mode = '0';
                    continue;
                } 
                if(i % 2 != 0){
                   ret.append(codeCharArr[i]); 
                }
            }
        }
        if(ret.toString().isBlank()){
            return new String("EMPTY");
        }
        return ret.toString();
    }
}