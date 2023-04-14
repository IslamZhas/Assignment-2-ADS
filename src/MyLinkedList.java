import java.util.Iterator;

public class MyLinkedList<T> implements List<T>{
    private class Node<T>{
        private final T data;
        private Node next;
        public Node(T data){
            this.data = data;
        }
    }
    private Node<T> head;
    private Node<T> tail;
    private int size;

    @Override
    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if(head == null){
            head = tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    @Override
    public T get(int index) {
        Node<T> current = head;
        for(int i = 0; i < index; i++){
            current = current.next;
        }
        return current.data;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void printList() {

    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }
    private class MyIterator implements Iterator<T>{
        Node<T> cursor = head;
        @Override
        public boolean hasNext() {
            return cursor != null;
        }

        @Override
        public T next() {
            T data = cursor.data;
            cursor = cursor.next;
            return data;
        }
    }
}
