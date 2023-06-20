import java.util.Scanner;

class three {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        
        
        System.out.print("Enter a string: ");
        String s = "00@#2 aj 2 jhdjshfj";
        char[] ch = s.toCharArray();
        int l = 0;
        int d = 0;
        int sp = 0;
        
        for(int i = 0; i < ch.length; i++){
            if (ch[i] == ' ')
                sp++;
            else if (ch[i] >= 48 && ch[i] <= 57)
                d++;
            else if ( (ch[i] >= 65 && ch[i] <= 90)
            || (ch[i] >= 97 && ch[i] <= 122))
                l++;
            
        }
        
        System.out.println("no. of letters : " + l);
        System.out.println("no. of digits : " + d);
        System.out.println("no. of spaces : " + sp);
    }
}