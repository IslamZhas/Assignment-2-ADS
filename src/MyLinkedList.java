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
    public void add(T element, int index) {

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

        for(int i = 0; i < getSize();i++){
            if(get(i) == o){
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        Node<T> temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    @Override
    public void sort() {

    }

    @Override
    public int indexOf(Object o) {
        int index = -1;
        for(int i = 0;i<getSize();i++){
            if(get(i) == o) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public int lastIndexOf(Object o) {
        int index = -1;
        for(int i = 0;i<getSize();i++){
            if(get(i) == o) index = i;
        }
        return index;
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
