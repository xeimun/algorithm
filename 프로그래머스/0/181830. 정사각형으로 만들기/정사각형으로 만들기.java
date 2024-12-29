import java.util.*;
class Solution {
    public int[][] solution(int[][] arr) {
        int rowCnt = arr.length;
        int colCnt = arr[0].length;
        if (rowCnt > colCnt) {
            for (int i = 0; i < rowCnt; i++) {
                arr[i] = Arrays.copyOf(arr[i], rowCnt);
            }
        }
        if (rowCnt < colCnt) {
            arr = Arrays.copyOf(arr, colCnt);
            for (int i = 0; i < colCnt - rowCnt; i++) {
                arr[rowCnt + i] = new int[colCnt];
            }
        }
        return arr;
    }
}