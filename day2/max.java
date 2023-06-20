public class max {
    

    static int find(int[] a) {
        int max = 0;
        for (int i: a) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        int[] a = {2,32, 22, 100};
        System.out.println(find(a));
    }
}
