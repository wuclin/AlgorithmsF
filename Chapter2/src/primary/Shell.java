package primary;

public class Shell {
    public static void sort(Comparable[] a){
        int N = a.length;
        int h = 1;
        while (h < N/3)
            h = 3*h + 1;           //找出最大的间隔
        while(h >= 1){
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(a[j], a[j-h]); j--)
                    exch(a, j, j-h);

            }
            h = h/3;

        }

    }
}
