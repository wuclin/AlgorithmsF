package PriorityQueue;

public class HeapSort {
    public static void sort(Comparable[] a){
        int N = a.length;
        for (int k = N/2; k >= 1; k--)
            sink(a, k, N);                  //构造堆
        while (N > 1){
            exch(a, 1, N--);                //循环将最大的元素a[1]和a[N]交换并修复堆
            sink(a, 1, N);
        }
    }
}
