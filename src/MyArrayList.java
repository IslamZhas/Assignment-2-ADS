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
    public int size() {
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
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
