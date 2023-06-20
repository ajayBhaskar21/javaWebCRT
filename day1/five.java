
// print nth fibbinocci

import java.util.*;

public class five {

    static int fib(int n) {
        if (n == 1){
            return 0;

        }
        else if (n == 2){
            return 1;

        }
        int a = 0;
        int b = 1;
        int s = 0;

        while (n - 2 != 0) {
            s = a + b;
            a = b;
            b = s;
            n--;
        }
        return s;

    }

    public static void main(String[] args) {
        
        int n = 7;
        System.out.println( n + "th fibnocci is " + fib(n));

    }
}
