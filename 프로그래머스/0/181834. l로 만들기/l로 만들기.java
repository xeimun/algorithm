class Solution {
    public String solution(String myString) {
        char[] arr = myString.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 108){
                arr[i] = 'l';
            }
        }
        return new String(arr);
    }
}