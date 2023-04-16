import java.util.Iterator;

public class MyArrayList <T> implements  List<T>{
    private Object[] arr;
    int size;
    int initialSize = 5;
    public MyArrayList(){
        arr = new Object[initialSize];
    }

    private void increaseSize(){
        int biggerSize = (int)(arr.length * 1.5);
        Object[] newArr = new Object[biggerSize];
        for(int i = 0; i < arr.length;i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
    @Override
    public void add(T element) {
        if(size == arr.length){
            increaseSize();
        }
        arr[size++] = element;
    }

    @Override
    public T get(int index) {
        return (T) arr[index];
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void remove(int index) {
        int smallerSize = arr.length - 1;
        Object[] newArr2 = new Object[smallerSize];
        for(int i = 0,k = 0; i < arr.length;i++){
            if(index == i)
                continue;
            newArr2[k++] = arr[i];
        }
        arr = newArr2;
        size--;
    }

    @Override
    public void printList() {
        for(int i = 0;i<getSize();i++){
            System.out.print(arr[i] + " ");
        }
    }

    @Override
    public boolean contains(Object o) {
        for(int i = 0; i<arr.length;i++){
            if(arr[i] == o){
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        int count = 0;
        for(int i = 0; i < arr.length;i++){
            arr[i] = null;
        }
        size = 0;
    }

    @Override
    public void sort() {

    }

    @Override
    public int indexOf(Object o) {
        int index = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i] == o){
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public int lastIndexOf(Object o) {
        int index = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i] == o){
                index = i;
            }
        }
        return index;
    }


    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<T>{
        private int cursor;
        @Override
        public boolean hasNext() {
            return cursor < getSize();
        }

        @Override
        public T next() {
            return get(cursor++);
        }
    }
}
