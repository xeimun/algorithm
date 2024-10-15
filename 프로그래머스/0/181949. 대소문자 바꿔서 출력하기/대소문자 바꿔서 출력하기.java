import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder strb = new StringBuilder();
        
        for(char ch : str.toCharArray()){
            
            if (Character.isUpperCase(ch)) {
                strb.append(Character.toLowerCase(ch));
            } else {
                strb.append(Character.toUpperCase(ch));
            }
        }
        
        String result = strb.toString();
        System.out.println(result);
        
        sc.close();
    }
}