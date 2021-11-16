package PriorityQueue;

/****
 * 比较，交换
 * 由下至上的堆有序化：只有当节点k大于他的父节点时，堆的有序状态会被改变
 * 由上至下的堆有序化：有序状态因为某个节点变得比两个子节点或一个子节点小被打破，需要将该节点下沉
 *
 * 分别对应插入元素和删除最大元素：删除最大元素直到队列为空可以得到有序序列，达到怕排序的效果
 * 插入元素：将新元素加到数组末尾，增加堆的大小并让这个新元素上浮到合适的位置
 * 删除最大元素：从数组顶端删去最大的元素并将数组的最后一个元素放到顶端，减小堆的大小并让这个元素下沉到合适的位置
 */
public class HeapMethods {
    private boolean less(int i, int j){
        return pq[i].compareTo(pq[j]) < 0;
    }
    private void exch(int i, int j){
        key t = pq[i];
        pq[i] = pq[j];
        pq[j] = t;
    }
    private void swim(int k){
        while(k > 1 && less(k/2, k)){
            exch(k/2, k);
            k = k/2;
        }
    }
    private void sink(int k){
        while (2*k <= N){
            int j = 2*k;
            if (j < N && less(j, j+1))
                j++;
            exch(k,j);
            k = j;
        }
    }
}
