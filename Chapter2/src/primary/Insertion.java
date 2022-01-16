package primary;
//{1,2,3,4,5}
//一个数默认有序，比较从后往，默认i之前都是有序的，交换的条件是后面的比前面的小
public class Insertion {
    public static void sort(Comparable[] a){
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && less(a[j],a[j-1]); j--) {
                exch(a, j, j-1);
            }
        }
    }
}
