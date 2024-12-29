class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int cnt = 0;
        for (int[] arr : answer) {
            for (int i = 0; i < arr.length; i++) {
                if (i == cnt) {
                    arr[i] = 1;
                    cnt++;
                    break;
                }
            }
        }
        return answer;
    }
}