public class Quick {

    public static void main(String[] args){
        Quick q = new Quick();
        int[] a = {2,5,3,1,4};
        q.sort(a);
        for (int i : a)
            System.out.println(i);
    }

    public void sort(int[] a){
        sort(a, 0, a.length - 1);
    }

    public void sort(int[] a, int lo, int hi){
        if (lo >= hi)
            return;
        int j = paration(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    public int paration(int[] a, int lo, int hi){
        int temp = a[lo];
        int i = lo, j = hi + 1;
        while (true){
            while(a[++i] < temp) if (i == hi) break;
            while(a[--j] > temp) if (j == lo) break;
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a,lo, j);
        return j;
    }

    public void exch(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
