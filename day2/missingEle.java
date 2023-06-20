import java.util.ArrayList;

public class missingEle {
    
    static void findMissing(int a[]) {

        ArrayList<Integer> s = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            s.add(a[i]);
        }

        int end = a[a.length - 1];

        for (int i = 1; i <= end; i++) {
            if (!s.contains(i)) {
                System.out.println(i + " ");
            }
        }
        

    }

    public static void main(String[] args) {
        
        int[] a = {1,2,3,4,6};

        findMissing(a);
    }
}
