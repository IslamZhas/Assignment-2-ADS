import java.util.Iterator;

public class MyLinkedList<T> implements List<T>{
    private class Node<T>{
        private final T data;
        private Node next;
        public Node(T data){
            this.data = data;
        }
    }
    private Node head;


    @Override
    public void add(T element) {

    }

    @Override
    public T get(int index) {
        return null;
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
        return null;
    }
}
