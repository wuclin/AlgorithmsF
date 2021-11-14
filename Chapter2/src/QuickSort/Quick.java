package QuickSort;

/***
 * 一般取首元素作为切分元素，切分元素左边的都比切分元素小，右边的都比切分元素大
 * 使用partition寻找切分元素的位置
 * 每一次执行切分就可以确定一个元素的位置
 */
public class Quick {
    public static void sort(Comparable[] a){
        sort(a, 0, a.length-1);
    }

    public static void sort(Comparable[] a, int lo, int hi){
        if (hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j-1);
        sort(a, j+1, hi);
    }
    private static int partition(Comparable[] a,int lo, int hi){
        int i = lo, j = hi+1;
        Comparable v = a[lo];
        while(true){
            while (less(a[++i]), v)) if (i == hi) break;
            while (less(v,a[--j])) if (j == lo) break;
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }
}
