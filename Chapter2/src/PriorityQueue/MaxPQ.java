package PriorityQueue;

/**
 * 完全二叉树可以使用数组来表示
 * 可在insert,delMax中加入代码动态改变数组的长度、
 */
public class MaxPQ<Key extends Comparable<Key>> {
    private Key[] pq;
    private int N = 0;                     //从1开始，pq[0]没有使用

    public MaxPQ(int maxN){
        pq = (Key[]) new Comparable[maxN+1];
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public int size(){
        return N;
    }

    public void insert(Key v){
        pq[++N] = v;
        swim(N);
    }

    public Key delMax(){
        Key max = pq[1];    //从根节点得到最大元素
        exch(1, N--);       //第一个元素和最后一个交换,同时减小堆的大小
        pq[N+1] = null;     //防止对象游离
        sink(1);            //恢复堆的有序性
        return max;
    }
}
