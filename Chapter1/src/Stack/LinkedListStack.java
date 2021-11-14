package Stack;

import java.util.Iterator;

/***
 * 链表
 */
public class LinkedListStack<Item> implements Iterable{
    private Node first;
    private int N;

    @Override
    public Iterator iterator() {
        return new Iterator() ;
    }
    private class Iterator implements java.util.Iterator<Item> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Item next() {
            return null;
        }
    }

    private class Node{
        Item item;
        Node next;
    }
    public Boolean isEmpty(){
        return N == 0;
    }
    public int Size(){
        return N;
    }
    public void push(Item item){
        Node node = new Node();
        node.item = item;
        node.next = first;
        first = node;
        N++;
    }
    public Item pop(){
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

}
