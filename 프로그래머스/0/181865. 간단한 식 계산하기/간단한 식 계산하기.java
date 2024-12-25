class Solution {
    public int solution(String binomial) {
        String[] arr = binomial.split("\\s");
        String op = arr[1];
        if (op.equals("+")) {
            return Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]);
        } else if (op.equals("-")) {
            return Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
        } else {
            return Integer.parseInt(arr[0]) * Integer.parseInt(arr[2]);
        }
    }
}