package Stack;

import java.util.Objects;

/**
 * 泛型写法
 * */
public class FixedCapacityStackOfStringsItem<Item> {
    private Item[] a;
    private int N;
    public FixedCapacityStackOfStringsItem(int cap){
        //a = new Item[cap]  注意这里不允许创建泛型数组,要使用类型转换
        a = (Item[]) new Object[cap];
    }
    public boolean isEmpty(){
        return N == 0;
    }
    public int size(){
        return N;
    }
    public void push(Item item){
        a[N++] = item;
    }
    public Item pop(){
        //最好是赋值为null，这样会被回收
        return a[--N];
    }
}
