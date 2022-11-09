import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;

public class MyArrayList<T> implements MyList<T> {
    private int size;
    private int maxSize;
    private T[] storage;

    public MyArrayList() {
        this(0, 10, (T[]) new Object[10]);
    }
    public MyArrayList(int size, int maxSize, T[] array) {
        this.size = size;
        this.maxSize = maxSize;
        storage = array;
    }


    public int getSize() {
        return size;
    }

    @Override
    public void add(T item) {
        storage[size] = item;
        size++;
        if ((maxSize - size) == 1) {
            grow();
        }
    }

    @Override
    public T get(int index) {
        if (maxSize > index) {
            return storage[index];
        }
        throw new IndexOutOfBoundsException();
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("maxSize=" + maxSize + ", size=" + size + ", data=[");
        for (int i = 0; i < size; i++) {
            if (i != size - 1) {
                result.append(get(i)).append(", ");
            }
            else {
                result.append(get(i)).append("]");
            }
        }
        return result.toString();
    }

    private void grow() {
        maxSize *= 2;
        T[] temp = this.storage.clone();
        this.storage = (T[]) new Object[this.maxSize];
        for (int i = 0; i < temp.length; i++) {
            storage[i] = temp[i];
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new MyArrayListIterator<>(this);
    }
}
