package Bag;

import java.util.Iterator;

public class LinkedListBag<Item> implements Iterable {

    private Node first;
    private class Node{
        Item item;
        Node next;
    }
    public void add(Item item){
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
    }

    @Override
    public Iterator iterator() {
        return new LinkedListBagIterator();
    }
    private class LinkedListBagIterator implements Iterator {

        private Node current = first;
        @Override
        public boolean hasNext() {
            return current == null;
        }

        @Override
        public Object next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}
