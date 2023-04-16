import java.util.Iterator;

public class MyLinkedList<T> implements List<T>{
    private class Node<T>{
        private final T data;
        private Node next;
        public Node(T data){
            this.data = data;
            next = null;
        }
    }
    private Node<T> head;//entry point
    private Node<T> tail;//last node
    private int size;//size of linked list

    @Override
    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        //if head(first node) is null, the head and tail will store newNode
        if(head == null){
            head = tail = newNode;
        }
        // else the last node(tail) will store the newNode
        else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    @Override
    //Create the node that is equal to current node(head), and through iterating
    public T get(int index) {
        Node<T> current = head;
        for(int i = 0; i < index; i++){
            current = current.next;
        }
        return current.data;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void remove(int index) {
        if(index == 0){
            head = head.next;
        }
        else{
            Node<T> current = head;
            for(int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    @Override
    public void printList() {
        for(int i = 0;i<getSize();i++){
            System.out.print(get(i) + " ");
        }
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public void sort() {

    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
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
