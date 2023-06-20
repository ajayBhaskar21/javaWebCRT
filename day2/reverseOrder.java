

public class reverseOrder {
    

    public static void main(String[] args) {
        
        String s = "Hello World";
        String[] ss = s.split(" ");
        String[] sol = new String[ss.length];
        int ind = 0;
        for(int i = ss.length - 1; i >= 0; i--) {
            sol[ind++] = ss[i];
        }
        String ans = "";
        for (int i = 0; i < sol.length - 1; i++){
            
            ans += sol[i] + " ";
        }
        ans += sol[sol.length - 1];
        System.out.println(ans);



    }

}
