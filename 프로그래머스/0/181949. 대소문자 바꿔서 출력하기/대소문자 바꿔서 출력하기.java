import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder b = new StringBuilder();
        
        for(int i=0; i<str.length(); i++){
            char a = str.charAt(i);
            
            if (Character.isUpperCase(a)) {
                b.append(Character.toLowerCase(a));
            } else {
                b.append(Character.toUpperCase(a));
            }
        }
        
        String c = b.toString();
        System.out.println(c);
        
        sc.close();
    }
}