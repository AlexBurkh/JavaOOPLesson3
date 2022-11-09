import java.util.Iterator;

public class MyArrayListIterator<T> implements Iterator<T> {
    int iteratorIndex = 0;
    MyArrayList<T> collection;

    public MyArrayListIterator(MyArrayList<T> collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        if (iteratorIndex < collection.getSize()) {
            return true;
        }
        return false;
    }

    @Override
    public T next() {
        return collection.get(iteratorIndex++);
    }
}
