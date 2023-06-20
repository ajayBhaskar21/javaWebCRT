import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("enter a num: ");
        int n = in.nextInt();

        int temp = n;

        int s = 0;
        while (n != 0) {
            s += Math.pow(n % 10, 3);
            n /= 10;
        }

        if(s == temp)
            System.out.println("Armstrong number");
        else    
            System.out.println("not an armstrong number");



    }    
}
