import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        boolean isEven = n % 2 == 0;
        
        if(isEven){
            System.out.println(n + " is even");
        }
        
        if(!isEven){
            System.out.println(n + " is odd");
        }
    }
}