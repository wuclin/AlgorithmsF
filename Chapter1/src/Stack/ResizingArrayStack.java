package Stack;

import java.util.Iterator;

/***
 * 下压栈
 * @param <Item>
 *     能够动态调整数组大小
 */
public class ResizingArrayStack<Item> implements Iterable<Item> {
    private Item[] a = (Item[]) new Object[1];
    private int N = 0;
    public boolean isEmpty(){
        return N==0;
    }
    public int size(){
        return N;
    }
    private void resize(int max){
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < max; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }
    public void push(Item item){
        if (N == a.length) resize(2*a.length);
        a[N++] = item;
    }
    public Item pop(){
        Item item = a[--N];
        a[N] = null;//避免孤儿对象
        if (N > 0 && N == a.length/4) resize(a.length/2); //如果数组内的元素个数小于长度的四分之一则缩小长度
        return item;
    }
    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }
    private class ReverseArrayIterator implements Iterator<Item>{
        private int i = N;
        public boolean hasNext(){
            return i > 0;
        }
        public Item next(){
            return a[--i];
        }
        public void remove(){}
    }
}
