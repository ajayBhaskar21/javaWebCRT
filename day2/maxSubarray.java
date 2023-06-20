

public class maxSubarray {
    



    public static void main(String[] args) {
        
        int[] a = {-2, 1, -3, 4, -1, 2, 1, -5};

        int max = Integer.MIN_VALUE;
        int s = 0;
        for (int i = 0; i < a.length ; i++ ) {
            
            for (int j = i; j < a.length; j++) {
                s = 0;
                for (int k = i ; k <= j; k++)
                    s += a[k];
                if (max < s)
                    max = s;
            }
            
        }

        System.out.println(max);
    }
}
