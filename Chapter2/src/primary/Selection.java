package primary;
public class Selection {
//{1,2,3,4,5}
    public static void sort(Comparable[] a){

        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i+1; j<N; j++)
                if (less(a[j],a[min])) min = j;
            exch(a, i, min);

        }
    }
}