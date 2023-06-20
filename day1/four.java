// palindrome or not

import java.util.Scanner;

public class four {
    

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        String s = "mom";
        char[] ch = s.toCharArray();
        String rev = 
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            if (ch[l] != ch[r]) {
                System.out.println("String is not a palindrome.");
                return ;
            }
            l++;
            r--;
        }
        System.out.println("String is a palindrome.");






    }
}
