public interface List<T> extends Iterable<T> {
    void add(T element);
    T get(int index);
    int getSize();
    void remove(int index);
    void printList();
    boolean contains(Object o);
    void clear();
    void sort();
    int indexOf(Object o);
    int lastIndexOf(Object o);
}
