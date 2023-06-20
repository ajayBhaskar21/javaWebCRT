// palindrome or not

import java.util.*;

public class four2 {
    
    

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int n = 121221;

        ArrayList <Integer> a = new ArrayList<>();
        while (n != 0) {
            a.add(n % 10);
            n /= 10;
        }
        int l = 0;
        int r = a.size() - 1;

        while (l < r) {
            if (a.get(l) != a.get(r)) {
                System.out.println("number is not a palindrome.");
                return ;
            }
            l++;
            r--;
        }
        System.out.println("number is a palindrome.");






    }
}
