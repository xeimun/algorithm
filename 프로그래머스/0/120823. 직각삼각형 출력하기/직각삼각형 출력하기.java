import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder star = new StringBuilder();
        star.append("*");
        for (int i = 1; i <= n; i++) {
            System.out.println(star);
            star.append("*");
        }
    }
}