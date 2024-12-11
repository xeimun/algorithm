class Solution {
    public String solution(String code) {
        int mode = 0;
        StringBuilder ret = new StringBuilder();
        
        for(int idx = 0; idx < code.length(); idx++){
            char codeChar = code.charAt(idx);
            
            if(codeChar == '1'){
                mode = mode == 0 ? 1 : 0;
                continue;
            }
            
            if(idx % 2 == mode){
                ret.append(codeChar);
            }
            
        }
        
        if(ret.toString().isBlank()){
            return "EMPTY";
        }
        return ret.toString();
    }
}